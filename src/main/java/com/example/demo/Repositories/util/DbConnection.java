package com.example.demo.Repositories.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    //Credentials and strings
    private static final String USERNAME = "spilbraet";
    private static final String PASSWORD = "Rj2k4yM_SN8_";
    private static final String CONNSTRING = "jdbc:mysql://den1.mysql1.gear.host/spilbraet?useSSL=false";

    //Creates a connection and returns it
    public static Connection getConnection() {
        try{
            return DriverManager.getConnection(CONNSTRING, USERNAME, PASSWORD);
        }
        catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
