package com.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ApartmentDao {

    @Autowired
    private SessionFactory sessionFactory;
    public void createApartment(Apartment apartment)
    {
        Session session = null;
        try
        {
            session = sessionFactory.openSession();
            session.beginTransaction();
            Integer id = (Integer) session.save(apartment);
            System.out.printf("Apartment "+id+" signed for lesased");
            session.getTransaction().commit();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

}
