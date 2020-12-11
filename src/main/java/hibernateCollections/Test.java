package hibernateCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
//		ArrayList <String> list1 =  new ArrayList<String>();
//		
//		list1.add("java is programming language");
//		list1.add("java is object oriented programming language");
//		
//		QuestionAndAnswer qs = new QuestionAndAnswer();
//		
//		qs.setQuestion("what is java");
//		qs.setAnswers(list1);
//		
		
		Configuration con = new Configuration().configure("hibernate8.cfg.xml");
		
		SessionFactory sf = con.buildSessionFactory();
			
		Session session = sf.openSession();
	    
	    Transaction tx = session.beginTransaction();
		
	    TypedQuery query = (TypedQuery) session.createQuery("from questions");
	    
	    java.util.List list = ((QuestionAndAnswer) query).List();
	    
	    System.out.println(list);
	    
	    
//	    Iterator<QuestionAndAnswer> itr = list.iterator();
//	    
//	    while(itr.hasNext())
//	    {
//	    	QuestionAndAnswer q = itr.next();
//	    	System.out.println("Question is:"+ q.getQuestion());
//	    	
//	    	List<String> list2 = q.getAnswers();
//	    	
//	    	Iterator itr2 = list2.iterator();
//	    	
//	    	 while(itr2.hasNext()){    
//	             System.out.println(itr2.next());    
//	         }  
	    			
//	    }
	    
	    
//		session.save(qs);
		
		tx.commit();
		
		sf.close();
			
		System.out.println("success"); 
	
				

	}

}
