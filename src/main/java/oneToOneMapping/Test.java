package oneToOneMapping;

import java.sql.ResultSet;
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
		


	     

		Configuration con = new Configuration().configure("hibernate9.cfg.xml");
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tx = s.beginTransaction();
	

		
		tx.commit();
		
		sf.close();
	}

}
