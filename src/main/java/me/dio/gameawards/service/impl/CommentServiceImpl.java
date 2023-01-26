package me.dio.gameawards.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.gameawards.domain.model.Comment;
import me.dio.gameawards.domain.repositorys.CommentRepository;
import me.dio.gameawards.service.CommentService;
import me.dio.gameawards.service.exception.BusinessException;
import me.dio.gameawards.service.exception.NoContentException;

@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	private CommentRepository repository;
	
	@Override
 	public List<Comment> findAll(){
		return repository.findAll();
	}

	@Override
	public Comment findById(Long id) {
		Optional<Comment> comment = repository.findById(id);
		
		return comment.orElseThrow(() -> new NoContentException());
	}
	
	public void insert(Comment comment) {
		if(comment.getId() != null) {
			throw new BusinessException("O ID é diferente de NULL na inclusão");
		}
		repository.save(comment);
	}
	
	@Override
	public void update(Long id, Comment comment) {
		Comment commentDb = findById(id);
		if(commentDb.getId().equals(comment.getId())){
			repository.save(comment);
		} else {
			throw new BusinessException("Os ID's para alteração são divergentes");
		}
	}

	@Override
	public void delete(Long id) {
		Comment commentDb = findById(id);
		repository.delete(commentDb);
	}
}
