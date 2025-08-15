package com.cfs.JPA_P02.entity;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String rollNum;

    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL) //cascade ->prevent the data failure
    private Laptop laptop;

    public Student() { }

    public Student(String name,String rollNum){
        this.name=name;
        this.rollNum=rollNum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNum() {
        return rollNum;
    }

    public void setRollNum(String rollNum) {
        this.rollNum = rollNum;
    }
}
