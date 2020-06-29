package com.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class MainLogic implements CommandLineRunner {
    @Autowired
    private ApartmentDao apartmentDao;
    public static void main(String[] args) {

        SpringApplication.run(MainLogic.class,args);

    }

    @Override
    public void run(String[] args) throws Exception {
        Apartment apartment = getApartment();
        apartmentDao.createApartment(apartment);

    }

    private Apartment getApartment()
    {
       Apartment apartment = new Apartment();
        apartment.setName("Finley");
        apartment.setBedroom(1);
        apartment.setRent(575.75);

        return apartment;
    }
}
