package com.example.restassured;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restassured.Dao.UserDaoService;
import com.example.restassured.Model.User;

@RestController
public class UserResource {
    @Autowired
	private UserDaoService service;
	
    @GetMapping("/users")
    public List<User> retrieveAlluser()
    {
    	
    	return service.findAll();
    }
    
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id)
    {
    	return service.findOne(id);
    }
	
    @PostMapping("/users")
    public void createUser(@RequestBody User user)
    {
    	User savedUser=service.save(user);
    
    }
}