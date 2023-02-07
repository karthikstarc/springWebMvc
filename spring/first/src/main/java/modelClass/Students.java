package modelClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class Students {
	public static void main(String[] args) {
		StudentDetails stu = new StudentDetails();
		stu.setId(2);
		stu.setName("thor");
		stu.setCity("london");
		

		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(StudentDetails.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		int i = 1;
		
		//session.save(stu);
		stu = (StudentDetails)session.get(StudentDetails.class, i);
		System.out.println(stu);
		tx.commit();
		

	}
}