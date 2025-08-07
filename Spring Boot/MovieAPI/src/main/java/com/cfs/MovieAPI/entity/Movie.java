package com.cfs.MovieAPI.entity;

public class Movie {
    private long id;
    private String title;
    private String genre;
    private int releaseYear;
    private double rating;

    public Movie(){ }

    public Movie(long id,String title,String genre,int releaseYear,double rating){
        this.id=id;
        this.title=title;
        this.genre=genre;
        this.releaseYear=releaseYear;
        this.rating=rating;
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

    public void setGenre(String genre){
        this.genre=genre;
    }

    public String getGenre(){
        return this.genre;
    }

    public void setReleaseYear(int releaseYear){
        this.releaseYear=releaseYear;
    }

    public int getReleaseYear(){
        return this.releaseYear;
    }

    public void setRating(double rating){
        this.rating=rating;
    }

    public double getRating(){
        return this.rating;
    }
}
