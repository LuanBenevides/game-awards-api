package me.dio.gameawards.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.gameawards.domain.model.Game;
import me.dio.gameawards.domain.repositorys.GameRepository;
import me.dio.gameawards.service.GameService;
import me.dio.gameawards.service.exception.BusinessException;
import me.dio.gameawards.service.exception.NoContentException;

@Service
public class GameServiceImpl implements GameService{

	@Autowired
	private GameRepository repository;
	
	@Override
	public List<Game> findAll() {
		return repository.findAll();
	}

	@Override
	public Game findById(Long id) {
		Optional<Game> game = repository.findById(id);
		return game.orElseThrow(() -> new NoContentException());
	}

	@Override
	public void insert(Game game) {
		
		if(game.getId() != null) {
			throw new BusinessException("O ID é diferente de NULL na inclusão");			
		}
		repository.save(game);
	}

	@Override
	public void update(Long id, Game game) {
		Game gameDb = findById(id);
		if(gameDb.getId().equals(game.getId())){
			repository.save(game);
		} else {
			throw new BusinessException("Os ID's para alteração são divergentes");
		}
	}

	@Override
	public void delete(Long id) {
		Game gameDb = findById(id);
		repository.delete(gameDb);
	}

}
