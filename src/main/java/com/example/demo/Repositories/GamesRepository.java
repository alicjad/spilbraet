package com.example.demo.Repositories;

import com.example.demo.Model.Game;
import com.example.demo.Repositories.util.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GamesRepository implements IGameRepository {
    private PreparedStatement preparedStatement;
    private ResultSet result;

    public GamesRepository() {

    }


    @Override
    public Game read(int id) {
        Connection conn = null;
        try {
            conn = DbConnection.getConnection();
            preparedStatement = conn.prepareStatement("SELECT * FROM games where id=?");
            preparedStatement.setInt(1, id);
            result = preparedStatement.executeQuery();

            if (result.next()) {
                return new Game(
                        result.getInt("id"),
                        result.getString("title"),
                        result.getString("description"),
                        result.getString("image"),
                        result.getFloat("price")
                );
            }


        }
        catch (SQLException e)
        {
            e.printStackTrace();
            return null;
        }

        return null;
    }

    @Override
    public void update(Game game) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public ArrayList<Game> readAll() {
        ArrayList<Game> games = new ArrayList<>();
        Connection conn = null;
        try {
            conn = DbConnection.getConnection();
            preparedStatement = conn.prepareStatement("SELECT * FROM games");
            result = preparedStatement.executeQuery();

            while(result.next()){

                games.add(new Game(result.getInt("id"),
                        result.getString("title"),
                        result.getString("description"),
                        result.getString("image"),
                        result.getFloat("price")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }

        return games;
    }
}
