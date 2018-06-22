package com.example.data;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
	
	public List<User> findAll();
	public List<User> findByFirstName(String firstName);

}
