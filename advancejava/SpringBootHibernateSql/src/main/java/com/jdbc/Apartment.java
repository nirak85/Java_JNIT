package com.jdbc;

import org.springframework.stereotype.Component;



import javax.persistence.*;


@Entity
@Table(name = "apartment")
public class Apartment {
    @Id
    @Column(name = "Apartment_Number")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name="Apt_Name")
    private String name;
    @Column(name="Bedroom")
    private Integer bedroom;
    @Column(name="Rent")
    private Double rent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBedroom() {
        return bedroom;
    }

    public void setBedroom(Integer bedroom) {
        this.bedroom = bedroom;
    }

    public Double getRent() {
        return rent;
    }

    public void setRent(Double rent) {
        this.rent = rent;
    }
}
