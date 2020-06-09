package com.many;

import java.util.HashSet;
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
		 
		Artist a= new Artist();
		a.setAid(1);
		a.setAname("Freddie");
		a.setMain("Vocals");
		a.setAge(29);
		
		Artist a1= new Artist();
		a1.setAid(2);
		a1.setAname("Brian");
		a1.setMain("Guitar");
		a1.setAge(27);
		
		Artist a2= new Artist();
		a2.setAid(3);
		a2.setAname("John");
		a2.setMain("Bass");
		a2.setAge(28);
		
		Artist a3= new Artist();
		a3.setAid(4);
		a3.setAname("Roger");
		a3.setMain("Drums");
		a3.setAge(30);
		
		
		Album al=new Album();
		al.setAlid(11);
		al.setAlname("Queen");
		al.setGenres("Rock");
		al.setDate(1973);
		
		Album al1=new Album();
		al1.setAlid(22);
		al1.setAlname("QueenII");
		al1.setGenres("Rock");
		al1.setDate(1974);
		
		Set s=new HashSet();
		s.add(al);
		s.add(al1);
		
		a.setAlbum(s);
		a1.setAlbum(s);
		a2.setAlbum(s);
		a3.setAlbum(s);
		
		se.save(a);
		se.save(a1);
		se.save(a2);
		se.save(a3);
		
		tx.commit();
		
		se.close();
		sf.close();

}
}
