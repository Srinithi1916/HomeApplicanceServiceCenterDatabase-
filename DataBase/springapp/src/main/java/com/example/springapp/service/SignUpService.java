package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.SignUp;
import com.example.springapp.repository.SignUpRepo;

@Service
public class SignUpService {
    @Autowired
    private final SignUpRepo su;
    public SignUpService(SignUpRepo su)
    {
        this.su=su;
    }
    public SignUp  createSignUp (SignUp obj)
    {
         return su.save(obj);
    }
    public  List <SignUp> getAllSignUp()
    {
        return su.findAll();
    }
    public SignUp getById(int userid)
    {
        return su.findById(userid).orElse(null);
    }
    public SignUp update (int userid,SignUp signUp)
    {
        SignUp model=su.findById(userid).orElse(null);
        if(model !=null)
        {
            model.setUsername(signUp.getUsername());
            su.save(model);
            return model;
        }
        else
         return signUp;
    }
    public String delete(int userid)
    {
        su.deleteById(userid);
        return "Deleted Successfully";

    }
    
}
