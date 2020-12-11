package typeperHierarchyAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		
		
		try {	
			Configuration con = new Configuration().configure("hibernate2.cfg.xml");
			
			// ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
			
			SessionFactory sf = con.buildSessionFactory();
			
			Session session= sf.openSession();
			
			Transaction tx = session.beginTransaction();
			
	      Employee e1=new Employee();    
          e1.setName("Gaurav Chawla");    
//              
//          Regular_Employee e2=new Regular_Employee();    
//          e2.setName("Vivek Kumar");    
//          e2.setSalary(50000);    
//          e2.setBonus(5);    
//              
//          Contract_Employee e3=new Contract_Employee();    
//          e3.setName("Arjun Kumar");    
//          e3.setPay_per_hour(1000);    
//          e3.setContract_duration("15 hours");    
//              
          session.persist(e1);    
//          session.persist(e2);    
//          session.persist(e3);  
          
	tx.commit();
		
		sf.close();
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}

	}

}
