package com.one;

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
		
		Doctor x=new Doctor();
		x.setDid(22);
		x.setDname("Lewis");
		
		Detail de= new Detail();
		de.setSid(11);
		de.setSpeciality("Cardiologist");
		de.setHospital("Choctaw");
		de.setD(x);
		
		Transaction tx= se.beginTransaction();
		se.save(de);

		tx.commit();
		
		se.close();
		sf.close(); 
		
	}

}
