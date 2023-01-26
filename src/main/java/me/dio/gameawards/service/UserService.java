package me.dio.gameawards.service;

import java.util.List;

import me.dio.gameawards.domain.model.User;

public interface UserService {

	List<User> findAll();
	
	User findById(Long id);
	
	void insert(User user);
	
	void update(Long id, User user);
	
	void delete(Long id);
	
}
