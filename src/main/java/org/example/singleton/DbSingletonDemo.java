package org.example.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {

    public static void main(String[] args) throws SQLException {
        DbSingleton dbSingletonInstance = DbSingleton.getInstance();
        System.out.println(dbSingletonInstance);

        Connection conn = dbSingletonInstance.getConnection();

        Statement statement = conn.createStatement();

        statement.execute("create table students (ID int primary key , name varchar(65))");

        System.out.println("Create table students");

        int rows = statement.executeUpdate("insert into students (ID, name) values (1, 'Cosmin')");
        System.out.println(rows);

        if(rows > 0){
            System.out.println("inserted a new row.");
        }

        conn.close();
    }
}
