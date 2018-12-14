package com.example.demo.Model;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {
    Game game = new Game(22, "Game Title", "Game Description", "I am image", 99, "something");
    @Test
    public void getId() throws Exception {
        assertEquals(22, game.getId());
    }

    @Test
    public void setId() throws Exception {
        Game newGame = new Game();
        newGame.setId(1122);
        assertEquals(1122, newGame.getId());

    }

    @Test
    public void getTitle() throws Exception {
        assertEquals("Game Title", game.getTitle());
    }

    @Test
    public void setTitle() throws Exception {
        Game newGame = new Game();
        newGame.setTitle("I am a title");
        assertEquals("I am a title", newGame.getTitle());
    }

    @Test
    public void getDescription() throws Exception {
        assertEquals("Game Description", game.getDescription());
    }

    @Test
    public void setDescription() throws Exception {
        Game newGame = new Game();
        newGame.setDescription("I am a description");
        assertEquals("I am a description", newGame.getDescription());

    }

    @Test
    public void getImage() throws Exception {
        assertEquals("I am image", game.getImage());
    }

    @Test
    public void setImage() throws Exception {
        Game newGame = new Game();
        newGame.setImage("I am image too");
        assertEquals("I am image too", newGame.getImage());


    }

    @Test
    public void getPrice() throws Exception {
        assertEquals(99, game.getPrice(), 0.01);
    }

    @Test
    public void setPrice() throws Exception {
        Game newGame = new Game();
        newGame.setPrice(123);
        assertEquals(123, newGame.getPrice(), 0.01);

    }

    @Test
    public void getLink() throws Exception {
        assertEquals("something", game.getLink());
    }

    @Test
    public void setLink() throws Exception {
        Game newGame = new Game();
        newGame.setLink("IamALink");
        assertEquals("IamALink", newGame.getLink());

    }

}