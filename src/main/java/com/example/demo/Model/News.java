package com.example.demo.Model;

public class News {

    private int news_id;
    private String description;

    public News() {
    }

    public News(int news_id, String description) {
        this.news_id = news_id;
        this.description = description;
    }

    public int getNews_id() {
        return news_id;
    }

    public void setNews_id(int news_id) {
        this.news_id = news_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
