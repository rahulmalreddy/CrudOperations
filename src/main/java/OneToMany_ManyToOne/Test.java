package OneToMany_ManyToOne;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Test {
	
	public static void main(String[] args) {
		
		Question q = new Question();
//		q.setQid(1);
		q.setQname("what is java");
		
		List<Answer> list = new ArrayList<Answer>();
		Answer a = new Answer();
//		a.setAid(1);
		a.setAnswerf("java is programming lang");
		
		Answer a1 = new Answer();
//		a1.setAid(2);
		a1.setAnswerf("java is oops");
		
		Answer a3 = new Answer();
//		a3.setAid(3);
		a3.setAnswerf("java is web developer lang");
		
		list.add(a);
		list.add(a1);
		list.add(a3);
		
		q.setAnswers(list);
		
		
		
	     

		Configuration con = new Configuration().configure("hibernate10.cfg.xml");
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tx = s.beginTransaction();
		
         s.save(q);
//         s.save(list);
		
		

	
		
		
		tx.commit();
		
		sf.close();
	}

}
