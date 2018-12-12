package com.example.demo.Model;

public class News {

    private int newsId;
    private String title;
    private String description;
    private String image;

    public News() {
    }

    public News(int newsId,String title, String description, String image) {
        this.newsId = newsId;
        this.title=title;
        this.description = description;
        this.image=image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage(){return image; }

    public void setImage(String image){ this.image=image; }

}
