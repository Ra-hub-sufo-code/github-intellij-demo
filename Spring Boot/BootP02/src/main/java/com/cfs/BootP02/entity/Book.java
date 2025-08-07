package com.cfs.BootP02.entity;

public class Book {
    private long id;
    private String title;
    private String author;
    private double price;

    public Book() { }

    public Book(long id,String title,String author,double price){
        this.id=id;
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public void setId(long id){
        this.id=id;
    }

    public long getId(){
        return this.id;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setAuthor(String author){
        this.author=author;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public double getPrice(){
        return this.price;
    }
}
