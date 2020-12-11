package tablePerConcreteXml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setEname("varun");
		
		Reg_Employee rg = new Reg_Employee();
		rg.setSalary(20000);
		rg.setBonus(200);
		
		Contract_Emp ce = new Contract_Emp();
	    ce.setPay_per_hour(20);
	    ce.setContractDuration("2months");
		
		
		Configuration con = new Configuration().configure("hibernate5.cfg.xml");
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tx = s.beginTransaction();
		
		s.save(e);
		s.save(rg);
		s.save(ce);
		
		tx.commit();
		sf.close();

	}

}
