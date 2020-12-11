package crudhibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import persisitentclass.Student;

public class SelectStudent {

	
	public static void main(String[] args) {
		
		Configuration con = new Configuration();
		con.configure("hibernatePersistent.cfg.xml");
		SessionFactory sf =con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("enter the student id to find");
		
		Student st = (Student)session.load(Student.class,	sc.nextInt() );
		tx.commit();
		
		System.out.println("Student id is"+st.getSid()+ "name is"+st.getSname()+"mail is"+st.getMail()+"phno is"+st.getPhno());
		
		
		
		session.close();
		
		
	}
	
}
