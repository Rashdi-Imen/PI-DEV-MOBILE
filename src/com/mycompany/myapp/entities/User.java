/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.entities;


import java.util.Date;
import java.util.Random;

//import org.controlsfx.control.Notifications;
//import services.Mailling;
//import services.UserService;

/**
 *
 * @author mega pc
 */
public class User  {
    
    private int id;
    private String nom ;
    private String prenom ;
    private String role;
    private String password;
    private String email;
   private String adresse;
        private int tel;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }





    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }



    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }


    

  

    
    public Integer rondomcode()
    {
Random rand=new Random();
int randomcode=rand.nextInt(999999);
 return randomcode; 
    }
 
    
    
    
}
