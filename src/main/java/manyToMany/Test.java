package manyToMany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	
	public static void main(String[] args) {
		
        Course c = new Course();
        c.setCid(1);
        c.setCname("java");
        c.setCfee(2000);
        
       Course c1 = new Course();
        c1.setCid(2);
        c1.setCname("advjava");
        c1.setCfee(2000);
         
        Course c2 = new Course();
        c2.setCid(3);
        c2.setCname("jdbc");
        c2.setCfee(1000);
        
        Course c3 = new Course();
        c3.setCid(4);
        c3.setCname("jsp");
        c3.setCfee(4000);
        
        Course c4 = new Course();
        c4.setCid(5);
        c4.setCname("hibernabte");
        c4.setCfee(3000);
        
        Set<Course> set = new HashSet<Course>();
        set.add(c);
        set.add(c1);
        
        Set<Course> set1 = new HashSet<Course>();
        set.add(c2);
        set.add(c3);
        set.add(c4);
        
        
        
        Faculty f= new Faculty();
        f.setFid(1);
        f.setFname("varun");
        f.setFexp(20);
        f.setCourse(set1);
        
        Faculty f1= new Faculty();
        f1.setFid(2);
        f1.setFname("rahul");
        f1.setFexp(2);
        f1.setCourse(set);
        
        Faculty f3= new Faculty();
        f3.setFid(3);
        f3.setFname("ku ar");
        f3.setFexp(2);
        f3.setCourse(set);
        
		
		
	     

		Configuration con = new Configuration().configure("hibernateManytoMany.cfg.xml");
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tx = s.beginTransaction();
		
        s.save(f1);
          s.save(f);
          s.save(f3);
//          s.save(c);
//          s.save(c1);
//          s.save(c2);
//          s.save(c3);
//          s.save(c4);
          
	
		
		
		tx.commit();
		System.out.println("success");
		sf.close();
		
	}

}
