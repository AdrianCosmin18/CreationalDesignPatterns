package org.example.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

    private Connection conn = null;

    private static class LazyHolder {
        static final DbSingleton INSTANCE = new DbSingleton();// daca facem asa e lazy si thread safe => va fi creata doar daca este chemata
    }

    private DbSingleton(){
        try{
            String jdbcURL = "jdbc:h2:mem:test";
            conn = DriverManager.getConnection(jdbcURL);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static DbSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    public Connection getConnection(){ // e thread safe pentru ca nu putem obtine o instanta fara a folosi getInstance care va initialzia tot prin lazy holder
        return conn;
    }
}
