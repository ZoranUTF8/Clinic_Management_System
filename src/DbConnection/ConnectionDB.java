/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author zoranhome
 */
public class ConnectionDB {

    public static Connection getConn() {

        try {
            Connection dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dentaldb", "root", "Moeko2023!");

            return dbConnection;

        } catch (Exception e) {
            System.err.println("Error connecting to db");
            System.err.println(e);
            return null;
        }
    }


    
}
