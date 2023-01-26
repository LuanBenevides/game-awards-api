package me.dio.gameawards.service;

import java.util.List;

import me.dio.gameawards.domain.model.Comment;

public interface CommentService {

	List<Comment> findAll();
	
	Comment findById(Long id);
	
	void insert(Comment comment);
	
	void update(Long id, Comment comment);
	
	void delete(Long id);
}
