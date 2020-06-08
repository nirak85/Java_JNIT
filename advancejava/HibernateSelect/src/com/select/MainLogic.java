package com.select;

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
		
//		Product x= new Product();
//		x.setPid(2024);
//		x.setPname("HP");
//		x.setPrice(80000);
//		
//		Transaction tx= se.beginTransaction();
//		se.save(x);
//		tx.commit();
		
//		Object o = se.get(Product.class,new Integer(2024));  //return type of get is object

//		Object o= se.load(Product.class, 2024); 
//
//		Product p= (Product)o;	//we have to convert into product
//		System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPrice());
		
		Product x= new Product();
	    x.setPid(2024);
		x.setPname("Lenovo");
		x.setPrice(80000);
		
		Transaction tx= se.beginTransaction();
//		se.save(x);
//		se.update(x);
		se.delete(x);
		tx.commit();
		
		
		
		se.close();
		sf.close(); 
		
	}

}
