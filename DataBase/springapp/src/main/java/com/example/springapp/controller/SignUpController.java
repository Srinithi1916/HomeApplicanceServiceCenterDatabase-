package com.example.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.SignUp;
import com.example.springapp.service.SignUpService;


@RestController
@RequestMapping("/api")
public class SignUpController {
    @Autowired
    private final SignUpService signUpService;

    public SignUpController(SignUpService signUpService) {
        this.signUpService = signUpService;
    }

    @PostMapping("/SignUp")
    public ResponseEntity<SignUp> createSignUp(@RequestBody SignUp signUp) {
        SignUp createSignUp = signUpService.createSignUp(signUp);
        return new ResponseEntity<>(createSignUp, HttpStatus.CREATED);
    }

    @GetMapping("/SignUp")
    public ResponseEntity<List<SignUp>> getAllSignUp() {
        List<SignUp> signUp = signUpService.getAllSignUp();
        return new ResponseEntity<>(signUp, HttpStatus.OK);
    }

    @GetMapping("/SignUp/{userid}")
    public SignUp getMethodName(@PathVariable int userid) {
        return signUpService.getById(userid);
    }
    


    @PutMapping("/SignUp/{userid}")
    public SignUp putSignUp(@PathVariable int userid, @RequestBody SignUp signUp) {
        return signUpService.update(userid, signUp);
    }

    @DeleteMapping("/SignUp/{userid}")
    public String delete(@PathVariable int userid) {
        return signUpService.delete(userid);
    }

}
