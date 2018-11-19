package com.example.demo.Model;

public class Game {
    private int id;
    private String title;
    private String description;
    private String quote;
    private String bulletpoints;
    private String image;
    private float price;

    public Game() {
    }

    public Game(int id, String title, String description, String image, float price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.image = image;
        this.price = price;
    }

    public Game(int id, String title, String description, String quote, String bulletpoints, String image, float price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.quote = quote;
        this.bulletpoints = bulletpoints;
        this.image = image;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getBulletpoints() {
        return bulletpoints;
    }

    public void setBulletpoints(String bulletpoints) {
        this.bulletpoints = bulletpoints;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
