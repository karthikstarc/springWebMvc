package homeController;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;

import modelClass.StudentDetails;

@Controller
public class Parent{
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/getDetails")
	public String getd() {
		return "getDetails";
	}
	@RequestMapping("/updateDetails")
	public String updateD() {
		return "updateDetails";
	}
	@RequestMapping("/delete")
	public String deleteR() {
		return "deleteRecord";
	}
	@RequestMapping("/index")
	public String home() {
		return "index";
	}
	int i = 600; //total marks
	@ModelAttribute
	public void common(Model m) {
		m.addAttribute("marks",i);
	}
	
	@RequestMapping("/getDetailsResult")
	public String getDetailsR(@RequestParam("id") int i, Model m) {
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(StudentData.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		
		//session.save(stu);
		StudentData stu = (StudentData)session.get(StudentData.class, i);
		m.addAttribute("stu",stu);
		tx.commit();

		return "getDetailsResult";
	}
	
	@RequestMapping("/updateDetailsResult")
	public String updateDetailsR(@ModelAttribute StudentData stu, Model m) {
		
		m.addAttribute("stu",stu);
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(StudentData.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.saveOrUpdate(stu);
		tx.commit();
		
		return "updateDetailsResult";
	}
	
	@RequestMapping("/deleteResult")
	public String deleteDetailsR(@RequestParam("id") int i) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(StudentData.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		
		//session.save(stu);
		StudentData stu = (StudentData)session.get(StudentData.class, i);
		session.delete(stu);
		tx.commit();
		return "deleteResult";	
		}
	
	@RequestMapping("/addDetailsResult")
	public String addDetailsR(@ModelAttribute StudentData stu, Model m) {
		m.addAttribute("stu",stu);
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(StudentData.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		
		session.save(stu);
		//stu = (StudentDetails)session.get(StudentDetails.class, 1);
		tx.commit();
		return "addDetailsResult";
	}

	}
