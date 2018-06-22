package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.data.User;
import com.example.data.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserRepository userRepo;

	@RequestMapping("/getAllUsers")
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	@RequestMapping(value="/{firstName}")
	public List<User> getUsersByFirstName(@PathVariable("firstName") String firstName){
		return userRepo.findByFirstName(firstName);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody User user){
		userRepo.save(user);
	}
	

	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody User user){
		userRepo.save(user);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/{id}")
	public void delete(@PathVariable("id") String id){
		userRepo.deleteById(id);
	}
	
}
