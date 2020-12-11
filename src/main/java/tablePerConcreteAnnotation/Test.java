package tablePerConcreteAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setEname("varun");
		
		Reg_Employee rg = new Reg_Employee(0,"kk",23,44);
		
		
		Contract_Emp ce = new Contract_Emp(0, "name",20,"2months");
		
		
		Configuration con = new Configuration().configure("hibernate6.cfg.xml");
		
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
