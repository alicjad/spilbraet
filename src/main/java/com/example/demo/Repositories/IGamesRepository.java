package com.example.demo.Repositories;

import com.example.demo.Model.Game;

import java.time.LocalDate;
import java.util.ArrayList;

public interface IGamesRepository {
    Game read(int id);
    void update(Game game);
    void delete(int id);
    ArrayList<Game> readAll();
}
