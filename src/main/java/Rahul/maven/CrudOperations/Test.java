package Rahul.maven.CrudOperations;

import java.util.Iterator;
import java.util.List;

import org.hibernate.AnnotationException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
;

public class Test {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
//		Employee e = new Employee();
//		
//		e.setEid(102);
//		e.setEname("varun");
//		e.setEsalary(20000);
//		e.setEdepartment("plan");
//		e.setYear("2020");
//		
//	     Emp_address ad = new Emp_address();
//	  ad.setAddressid(102);
//	  ad.setCity("hyderabad");
//	  ad.setPlotno(222);
//	  ad.setStreetname("nnnn");
//	  
//	  e.setAddress(ad);
//
//		Configuration con = new Configuration().configure("hibernate3.cfg.xml");
//		
//		// ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
//		
//		SessionFactory sf = con.buildSessionFactory();
//		
//		Session session= sf.openSession();
//		
//		Transaction tx = session.beginTransaction();
//		
////	e= (Employee) session.get(Employee.class,101);
//     	session.save(e);
//			
//		
//	tx.commit();
//	
//	sf.close();
//	System.out.println(e);
//	System.out.println(ea);
		 @SuppressWarnings("deprecation")
		AnnotationConfiguration config = new AnnotationConfiguration();
		  config.addAnnotatedClass(Employee.class);
		  SessionFactory factory= config.configure().buildSessionFactory();
		  Session session = factory.getCurrentSession();
		  session.beginTransaction();
		  Query queryResult = session.createQuery("from Employee");
		  java.util.List allemp;
		  allemp = queryResult.list();
		  for (int i = 0; i < allemp.size(); i++) {
		  Employee emp = (Employee) allemp.get(i);
		  }
		 System.out.println("Database contents delivered..."); 
		 }
		
	}

