package me.dio.gameawards.service;

import java.util.List;

import me.dio.gameawards.domain.model.Avaluation;

public interface AvaluationService {

	List<Avaluation> findAll();
	
	Avaluation findById(Long id);
	
	void insert(Avaluation avaluation);
	
	void update(Long id, Avaluation avaluation);
	
	void delete(Long id);
}
