/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;




/**
 *
 * @author hossa
 */
public class Database {
    Connection connexion;
	
 public  void loadDatabase() {
	        // Chargement du driver
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	        }

	        try {
	            connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	    

}

    

