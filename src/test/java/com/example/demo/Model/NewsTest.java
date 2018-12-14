package com.example.demo.Model;

import org.junit.Test;

import static org.junit.Assert.*;

public class NewsTest {
    News news = new News(99,"News title", "News description", "imagelink");
    @Test
    public void getTitle() throws Exception {
        assertEquals("News title", news.getTitle());
    }

    @Test
    public void setTitle() throws Exception {
        News news2 = new News();
        news2.setTitle("News title 2");
        assertEquals("News title 2", news2.getTitle());
    }

    @Test
    public void getNewsId() throws Exception {
        assertEquals(99, news.getNewsId());
    }

    @Test
    public void setNewsId() throws Exception {
        News news2 = new News();
        news2.setNewsId(99);
        assertEquals(99, news2.getNewsId());
    }

    @Test
    public void getDescription() throws Exception {
        assertEquals("News description", news.getDescription());
    }

    @Test
    public void setDescription() throws Exception {
        News news2 = new News();
        news2.setDescription("News description 2");
        assertEquals("News description 2", news2.getDescription());
    }

    @Test
    public void getImage() throws Exception {
        assertEquals("imagelink", news.getImage());
    }

    @Test
    public void setImage() throws Exception {
        News news2 = new News();
        news2.setImage("imagelink2");
        assertEquals("imagelink2", news2.getImage());
    }

}