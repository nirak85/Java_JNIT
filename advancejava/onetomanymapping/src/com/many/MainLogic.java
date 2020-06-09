package com.many;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		Transaction tx= se.beginTransaction();
		
	/*	
		Vendor v=new Vendor();
		v.setId(11);
		v.setVname("Staples");
		
		Office o= new Office();
		o.setOid(101);
		o.setOname("Jnit");
		Office o1= new Office();
		o1.setOid(202);
		o1.setOname("Cubic");
		Office o2= new Office();
		o2.setOid(303);
		o2.setOname("Csit");
		
		Set x=new HashSet(); 
		x.add(o);
		x.add(o1);
		x.add(o2);
	
		v.setX(x);  	//if there's no vender then there's no office
		se.save(v); 
		
		tx.commit();
		
		
		*/
		
		/*
		//select operation
		Object o= se.get(Vendor.class, 11);
		Vendor v=(Vendor)o;
		//se.delete(v);
		//tx.commit();  
		System.out.println(v.getId());
		System.out.println(v.getVname());
		
		Set x=v.getX();
 		Iterator li= x.iterator(); 	//to retrieve the value
		while(li.hasNext()){
			Object ob=li.next();
			Office off=(Office)ob;
			System.out.println(off.getOid()+" "+off.getOname()+" "+off.getFkid());
		}
		*/ 
		
		/*	// LIST
		Vendor v=new Vendor();
		v.setId(12);
		v.setVname("Staples");
		
		Office o= new Office();
		o.setOid(101);
		o.setOname("Jnit");
		Office o1= new Office(); 
		o1.setOid(202);
		o1.setOname("Cubic");
		Office o2= new Office();
		o2.setOid(303);
		o2.setOname("Csit");
		
		List l=new ArrayList(); 
		l.add(o);
		l.add(o1);
		l.add(o2);
	
		v.setX(l);  	
		se.save(v); 
		
		tx.commit();
		
		*/
		/*
		// Map
		Vendor v=new Vendor();
		v.setId(11);
		v.setVname("Staples");
		
		Office o= new Office();
		o.setOid(101);
		o.setOname("Jnit");
		Office o1= new Office();
		o1.setOid(202);
		o1.setOname("Cubic");
		Office o2= new Office();
		o2.setOid(303);
		o2.setOname("Csit");
		
		Map hm=new HashMap(); 
		hm.put("Office1", o);
		hm.put("Office2", o1);
		hm.put("Office3", o2);
	
		v.setX(hm);
		se.save(v); 
		*/
		
		//without set, list and map we are connecting with many-to-one. here we are creating the vendor object
		
		Vendor v=new Vendor();
		v.setId(11);
		v.setVname("Staples");
		
		Office o= new Office();
		o.setOid(101);
		o.setOname("Jnit");
		o.setV(v);
		Office o1= new Office();
		o1.setOid(202);
		o1.setOname("Cubic");
		 o1.setV(v);
		Office o2= new Office();
		o2.setOid(303);
		o2.setOname("Csit");
		o2.setV(v);
		
		se.save(o);
		se.save(o1); 
		se.save(o2);
		tx.commit();
		
		se.close();
		sf.close(); 
		
	 }

}
