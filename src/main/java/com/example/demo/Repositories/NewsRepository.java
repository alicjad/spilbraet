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
    private int size;

    public NewsRepository() {
    }

    @Override
    public News read(int id) throws SQLException {
        Connection conn;

        conn = DbConnection.getConnection();
        preparedStatement = conn.prepareStatement("SELECT * FROM news where newsId=?");
        preparedStatement.setInt(1, id);
        result = preparedStatement.executeQuery();
        result.next();


        return new News(
                    result.getInt("newsId"),
                    result.getString("title"),
                    result.getString("description"),
                    result.getString("image")
            );
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

            news.add(new News(result.getInt("newsId"),
                    result.getString("title"),
                    result.getString("description"),
                    result.getString("image")));

            size++;


        }
        return news;
    }

    @Override
    public void update(News news) {
        Connection conn = DbConnection.getConnection();

        try {
            preparedStatement = conn.prepareStatement("UPDATE news SET title= ? , description = ? , image= ? WHERE newsId= ? ");
            preparedStatement.setString(1,news.getTitle());
            preparedStatement.setString(2,news.getDescription());
            preparedStatement.setString(3,news.getImage());
            preparedStatement.execute();

        }catch (SQLException e){
            e.printStackTrace();
        }

    }

}
