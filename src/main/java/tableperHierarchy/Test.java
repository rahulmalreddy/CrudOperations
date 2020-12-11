package tableperHierarchy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.metamodel.Metadata;
import org.hibernate.metamodel.MetadataSources;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.service.internal.StandardServiceRegistryImpl;

public class Test {

	public static void main(String[] args) {
		
	
		  
	    
	try {	
		Configuration con = new Configuration().configure("hibernate2.cfg.xml");
		
		// ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session session= sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
	
		
		
		Employee2 emp = new Employee2();
//		emp.setId(101);
		emp.setName("rahul");
		
		Reg_emp rg= new Reg_emp();
//		rg.setId(103);
		rg.setName("varun");
		rg.setSalary(20000);
		rg.setBonus(10000);
		
		Contract_emp ce = new Contract_emp();
//		ce.setId(104);
		ce.setName("kkk");
		ce.setContract_duration("20");
		ce.setPay_per_hour(1000);
		
        session.save(emp);
        session.save(rg);
        session.save(ce);
	
		tx.commit();
		
		sf.close();
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}

	}

}
