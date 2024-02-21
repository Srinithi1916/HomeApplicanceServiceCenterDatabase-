package com.example.springapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SignUp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid;
    private String username;
    private String email;
    private String createpassword;
    private String confirmpassword;
    public SignUp()
    {
    }
    public SignUp(int userid,String username, String email, String createpassword, String confirmpassword) {
        this.userid=userid;
        this.username = username;
        this.email = email;
        this.createpassword = createpassword;
        this.confirmpassword = confirmpassword;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCreatepassword() {
        return createpassword;
    }
    public void setCreatepassword(String createpassword) {
        this.createpassword = createpassword;
    }
    public String getConfirmpassword() {
        return confirmpassword;
    }
    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }
    public int getUserid() {
        return userid;
    }
    public void setUserid(int userid) {
        this.userid = userid;
    }
    
    

}
