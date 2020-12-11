package crudhibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import persisitentclass.Student;

public class DeleteStudent {

	public static void main(String[] args) {
		
		
		Configuration con = new Configuration();
		con.configure("hibernatePersistent.cfg.xml");
		SessionFactory sf =con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("enter the student id to find");
		
		Student st = (Student)session.get(Student.class, sc.nextInt());
		
		session.delete(st);
		tx.commit();
	}

}
