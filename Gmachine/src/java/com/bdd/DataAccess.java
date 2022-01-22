/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bdd;

import com.beans.Machine;
import com.beans.Marque;
import com.beans.Utilisateur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hossa
 */
public class DataAccess {
    Database da=new Database();
    
    public void addMachine(Machine m){
        
        da.loadDatabase();
        try {
           PreparedStatement preparedStatement=da.connexion.prepareStatement("insert into machine values(null,?,?,?,?)");
            preparedStatement.setInt(1,m.getMarq());       
           preparedStatement.setString(2,m.getReference());
              preparedStatement.setString(3,m.getDateAchat());
                      preparedStatement.setDouble(4,m.getPrix());
                 
                   
                    preparedStatement.executeUpdate();
                    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
    
    public void editMachine(int id,String reference,String dateAchat,Double prix){
    
     da.loadDatabase();
        try {
           PreparedStatement preparedStatement=da.connexion.prepareStatement("update machine set reference= ?,dateAchat=?,prix=? where id=?");
         
           preparedStatement.setString(1,reference);
                    preparedStatement.setString(2,dateAchat);
                    preparedStatement.setDouble(3,prix);
                     preparedStatement.setInt(4,id);
                    preparedStatement.executeUpdate();
                    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    }
    public void delete(int id){
        da.loadDatabase();
     try {
           PreparedStatement preparedStatement=da.connexion.prepareStatement("delete from  machine where id=?");
           preparedStatement.setInt(1, id);
           preparedStatement.executeUpdate();
                   
                    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    }
    public   List<Machine> getAllMachines(){
       List<Machine> ms = new ArrayList<Machine>();
       Statement statement = null;
       ResultSet resultat = null;
       da.loadDatabase();
        try {
            statement = da.connexion.createStatement();

	            // Exécution de la requête
	            resultat = statement.executeQuery("select * from machine ,marque where marque.id=machine.id_marque ");
                     // Récupération des données
	            while (resultat.next()) {
                       int id=resultat.getInt("id");
	                String reference = resultat.getString("reference");
	                String dateAchat= resultat.getString("dateAchat");
	                Double  prix=resultat.getDouble("prix");
                        String Libelle=resultat.getString("libelle");
                        int marque=resultat.getInt("id_marque");
	              Machine tr=new Machine();
                      tr.setId(id);
	                tr.setReference(reference);
	                tr.setDateAchat(dateAchat);
	                tr.setPrix(prix);
                        tr.setMarq(marque);
                        tr.setLibelle(Libelle);
                        
	               
	                
	                ms.add(tr);
	            }
        
        
        } catch (SQLException e) {
	        } finally {
	            // Fermeture de la connexion
	            try {
	                if (resultat != null)
	                    resultat.close();
	                if (statement != null)
	                    statement.close();
	                if (da.connexion != null)
	                    da.connexion.close();
	            } catch (SQLException ignore) {
	            }
	        }
	        
	        
       return ms;
    }
    
    //Utilisateur 
     //register utilisateur ///
	  public  void ajoutUtilisateur(Utilisateur us) {
		  da.loadDatabase();
		  try {
			PreparedStatement preparedStatement=da.connexion.prepareStatement("INSERT INTO utilisateur(username,password,date_naissance,nom,prenom) values(?,?,?,?,?);");
			preparedStatement.setString(1, us.getUsername());
			preparedStatement.setString(2, us.getPassword());
			preparedStatement.setString(3,us.getDate_naissance());
			preparedStatement.setString(4, us.getNom());
                        preparedStatement.setString(5, us.getPrenom());
		
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  
		  
	  }
           public boolean recuperUtilisateur(Utilisateur ut){
	  boolean status =false;
	  
		  
	  da.loadDatabase();
	  try {
		  
		 
		 //create statement  using connexion object
		  PreparedStatement preparedStatement=da.connexion.prepareStatement("select  * from utilisateur where username=? and password=?");
		  preparedStatement.setString(1, ut.getUsername());
		  preparedStatement.setString(2, ut.getPassword());
		  
		 
		
		 // System.out.println(preparedStatement);
		
		  ResultSet rs=preparedStatement.executeQuery();
		  
		    status=rs.next();
			  
		
		 
		 
		  
	  }
	  catch(SQLException e) {
		    
		  e.printStackTrace();
		  }
	  
	  
	 return status;
	  
	  
	  
	  
	  }
        public void addMarque(Marque m){
        
        da.loadDatabase();
        try {
           PreparedStatement preparedStatement=da.connexion.prepareStatement("insert into marque values(null,?,?)");
                    preparedStatement.setString(1,m.getLibelle());
                    preparedStatement.setString(2,m.getCode());
                    preparedStatement.executeUpdate();
                    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
        
    public void editMarque(int id,String libelle,String code){
    
     da.loadDatabase();
        try {
           PreparedStatement preparedStatement=da.connexion.prepareStatement("update marque set libelle= ?,code=? where id=?");
         
           preparedStatement.setString(1,libelle);
                    preparedStatement.setString(2,code);
                     preparedStatement.setInt(3,id);
                    preparedStatement.executeUpdate();
                    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    }
     public void deleteMarque(int id){
        da.loadDatabase();
     try {
           PreparedStatement preparedStatement=da.connexion.prepareStatement("delete from  marque where id=?");
           preparedStatement.setInt(1,id);
           preparedStatement.executeUpdate();
                   
                    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    }
     
     public   List<Marque> getAllMarques(){
       List<Marque> ms = new ArrayList<Marque>();
       Statement statement = null;
       ResultSet resultat = null;
       da.loadDatabase();
        try {
            statement = da.connexion.createStatement();

	            // Exécution de la requête
	            resultat = statement.executeQuery("select * from marque");
                     // Récupération des données
	            while (resultat.next()) {
                       int id=resultat.getInt("id");
	                String libelle = resultat.getString("libelle");
	                String code= resultat.getString("code");
	              Marque tr=new Marque();
                      tr.setId(id);
	                tr.setLibelle(libelle);
	                tr.setCode(code);
	            
                        
	               
	                
	                ms.add(tr);
	            }
        
        
        } catch (SQLException e) {
	        } finally {
	            // Fermeture de la connexion
	            try {
	                if (resultat != null)
	                    resultat.close();
	                if (statement != null)
	                    statement.close();
	                if (da.connexion != null)
	                    da.connexion.close();
	            } catch (SQLException ignore) {
	            }
	        }
	        
	        
       return ms;
    }
     //Machine between two Date
     public   List<Machine> getMachinesByDates(String date1,String date2){
       List<Machine> ms = new ArrayList<Machine>();
       Statement statement = null;
       ResultSet resultat = null;
       da.loadDatabase();
        try {
            statement = da.connexion.createStatement();

	            // Exécution de la requête
                    PreparedStatement preparedStatement=da.connexion.prepareStatement("select ma.*,m.libelle FROM machine ma,marque m where ma.id_marque=m.id and dateAchat between ? and ?");
                    preparedStatement.setString(1, date1);
                    preparedStatement.setString(2, date2);
	            resultat = preparedStatement.executeQuery();
                     // Récupération des données
	            while (resultat.next()) {
                       int id=resultat.getInt("id");
	                String reference = resultat.getString("reference");
	                String dateAchat= resultat.getString("dateAchat");
	                Double  prix=resultat.getDouble("prix");
                        int marque=resultat.getInt("id_marque");
	              Machine tr=new Machine();
                      tr.setId(id);
	                tr.setReference(reference);
	                tr.setDateAchat(dateAchat);
	                tr.setPrix(prix);
                        tr.setMarq(marque);
                        
	               
	                
	                ms.add(tr);
	            }
        
        
        } catch (SQLException e) {
	        } finally {
	            // Fermeture de la connexion
	            try {
	                if (resultat != null)
	                    resultat.close();
	                if (statement != null)
	                    statement.close();
	                if (da.connexion != null)
	                    da.connexion.close();
	            } catch (SQLException ignore) {
	            }
	        }
	        
	        
       return ms;
    }
      public int countMachine() {
    	
       
         int  count=0;
        String sql = "select count(*) as count from machine ";
        try {
            PreparedStatement ps = da.connexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               count = rs.getInt("count");
                
            }

        } catch (SQLException e) {
            System.out.println("findAll " + e.getMessage());
        }
        return count ;
      }
           
           
}
