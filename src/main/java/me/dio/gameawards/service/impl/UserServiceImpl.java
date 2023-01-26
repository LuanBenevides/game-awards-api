package me.dio.gameawards.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.gameawards.domain.model.User;
import me.dio.gameawards.domain.repositorys.UserRepository;
import me.dio.gameawards.service.UserService;
import me.dio.gameawards.service.exception.BusinessException;
import me.dio.gameawards.service.exception.NoContentException;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository repository;
	
	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

	@Override
	public User findById(Long id) {
		Optional<User> user = repository.findById(id);
		return user.orElseThrow(() -> new NoContentException());
	}

	@Override
	public void insert(User user) {
		if(user.getId() != null) {
			throw new BusinessException("O ID é diferente de NULL na inclusão");
		}
		repository.save(user);
	}

	@Override
	public void update(Long id, User user) {
		User userDb = findById(id);
		
		if(userDb.getId().equals(user.getId())) {
			repository.save(user);
		}else {
			throw new BusinessException("Os ID's para alteração são divergentes");
		}
		
	}

	@Override
	public void delete(Long id) {
		User userDb = findById(id);
		repository.delete(userDb);
	}

}
