package crudhibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import persisitentclass.Student;

public class InsertEmployee {
	
	
	public static void main(String[] args) {
		
		Configuration con = new Configuration();
		con.configure("hibernatePersistent.cfg.xml");
		SessionFactory sf =con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx ;
		
		String choice = "no";
		
		Scanner sc  = new Scanner(System.in);
		
		do {
			tx = session.beginTransaction();
			Student st = new Student();
			System.out.println("enter student name");
			st.setSname("rahul2");
			System.out.println("enter student mail");
			st.setMail("rahul22@mail.com");
			System.out.println("enter student phno");
			st.setPhno(22221122);
			session.save(st);
			session.flush();
			tx.commit();
			System.out.println("one record inserted successfully");
			System.out.println("do you want to insert another record");
			choice = sc.nextLine();
			
			
		}
		while(choice.equalsIgnoreCase("y")||choice.equalsIgnoreCase("yes"));
		
		session.close();
		
		
	}

}
