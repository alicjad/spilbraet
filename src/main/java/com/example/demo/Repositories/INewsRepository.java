package com.example.demo.Repositories;

import com.example.demo.Model.News;

import java.sql.SQLException;
import java.util.ArrayList;

public interface INewsRepository {

        News read(int id) throws SQLException;
        void update(News news);
        void delete(int id);
        ArrayList<News> readAll() throws SQLException;
        ArrayList<News> readLatestThree() throws SQLException;
}
