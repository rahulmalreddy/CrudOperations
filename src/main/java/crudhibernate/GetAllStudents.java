package crudhibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import persisitentclass.Student;

public class GetAllStudents {

	public static void main(String[] args) {
		
		Configuration con = new Configuration();
		con.configure("hibernatePersistent.cfg.xml");
		SessionFactory sf =con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		List<Student> students = new ArrayList<Student>();
		
		
		students = session.createQuery("from Student").list();
		
		for(Student s:students)
		{
			System.out.println("Student id is"+s.getSid()+ "name is"+s.getSname()+"mail is"+s.getMail()+"phno is"+s.getPhno());
		}
		
       tx.commit();
	}

}
