package com.uok.v3.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection getDatabaseConnection(){

        try {

            String url="jdbc:mysql://localhost:3308/ecommerce_system_database";
            String username="root";
            String password="1234";

            Connection connection;
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url,username,password);
            return connection;

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

}