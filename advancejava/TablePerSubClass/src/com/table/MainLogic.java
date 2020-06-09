 package com.table;
 import org.hibernate.Session;
 import org.hibernate.SessionFactory;
 import org.hibernate.Transaction;
 import org.hibernate.cfg.Configuration;

 public class MainLogic {

 	public static void main(String[] args) {
 		
 		Configuration cf= new Configuration();
 	
 		cf.configure("configure.xml");
 		SessionFactory sf= cf.buildSessionFactory();
 		Session se= sf.openSession();
 		
 		Cheque c=new Cheque();
 		c.setPid(727);
 		c.setAmount(80000);
 		c.setChequeType("BOA");
 		
 		Transaction tx= se.beginTransaction();

 		se.save(c);
 		tx.commit();
 		
 		se.close();
 		sf.close(); 
 		
 	}

 }


