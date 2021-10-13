package com.example.demo.DBManager;

import com.example.demo.DAOs.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class DBOperations {

    private static volatile Connection connection;

    public static Connection getConnection() throws SQLException {

        if(connection == null){

            synchronized (DBOperations.class){

                if(connection==null){
                    connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/person", "root", "Amber@11");
                }
            }
        }else{
            return connection;
        }
    }

    public static void closeConnection(){

    }

    public static void insertPerson(){

    }

    public static List<Person> getPersons(){

        // geting persons from db

        return null;
    }

    public static void deletePerson(int id){

    }

    public static void updatePerson(Person person){

    }

}
