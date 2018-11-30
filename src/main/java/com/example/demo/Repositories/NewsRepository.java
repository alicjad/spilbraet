package com.example.demo.Repositories;
import com.example.demo.Model.News;
import com.example.demo.Repositories.util.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class NewsRepository implements INewsRepository {

    private PreparedStatement preparedStatement;
    private ResultSet result;

    public NewsRepository() {
    }

    @Override
    public News read(int id) throws SQLException {
        Connection conn;

        conn = DbConnection.getConnection();
        preparedStatement = conn.prepareStatement("SELECT * FROM news where id=?");
        preparedStatement.setInt(1, id);
        result = preparedStatement.executeQuery();

        if (result.next()) {
            return new News(
                    result.getInt("id"),
                    result.getString("description")
            );
        }
        return null;
    }

    @Override
    public void update(News news) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public ArrayList<News> readAll() throws SQLException {

        ArrayList<News> news = new ArrayList<>();
        Connection conn = DbConnection.getConnection();

        preparedStatement = conn.prepareStatement("SELECT * FROM news");
        result = preparedStatement.executeQuery();

        while(result.next()){

            news.add(new News(result.getInt("id"),
                    result.getString("title")));
        }
        return news;
    }
}
