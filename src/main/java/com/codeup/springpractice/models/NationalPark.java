package com.codeup.springpractice.models;

import javax.persistence.*;

@Entity
@Table(name ="parks")
public class NationalPark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;


//    Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //    Constructors


    public NationalPark() {
    }

    public NationalPark(String name) {
        this.name = name;
    }
}
