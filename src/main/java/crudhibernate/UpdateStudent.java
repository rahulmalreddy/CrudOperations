package crudhibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import persisitentclass.Student;

public class UpdateStudent {

	public static void main(String[] args) {
		
		Configuration con = new Configuration();
		con.configure("hibernatePersistent.cfg.xml");
		SessionFactory sf =con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
        Scanner sc  = new Scanner(System.in);
		
System.out.println("enter the student id to find");
		
		Student st = (Student)session.get(Student.class,	sc.nextInt() );
	
//		System.out.println(st.getMail());
		tx.commit();
		Transaction tx2 = session.beginTransaction();
		System.out.println("enter the mail to update");
		
		String mail="rahul.amall@mail";
		st.setMail(mail);
		session.update(st);
		st.setMail(mail);
		tx2.commit();
	
		session.close();

	}

}
