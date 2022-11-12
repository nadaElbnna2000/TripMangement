package com.example.demo.model;

import javax.persistence.*;

import java.io.Serializable;


@Entity
public class AdminModel implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false , updatable = false)
   private Long Id ;
    private boolean loggedIn = false;

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

   private String email;
  private String password;
    private String phone;

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public AdminModel() {
    }


    public Long getId() {
        return Id;
    }


    public void setId(Long id) {
        Id = id;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



    public AdminModel(Long Id  , boolean loggedIn ,  String email, String password, String phone , String userName) {
       this.Id = Id;
       this.loggedIn=loggedIn;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.userName = userName;

    }


//    public boolean changeLoggingIn(){
//        loggedIn = !loggedIn;
//
//        return loggedIn;
//
//    }
}
