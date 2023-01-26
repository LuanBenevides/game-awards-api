package me.dio.gameawards.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.gameawards.domain.model.Avaluation;
import me.dio.gameawards.domain.repositorys.AvaluationRepository;
import me.dio.gameawards.service.AvaluationService;
import me.dio.gameawards.service.exception.BusinessException;
import me.dio.gameawards.service.exception.NoContentException;

@Service
public class AvaluationServiceImpl implements AvaluationService{

	@Autowired
	private AvaluationRepository repository;
	
	@Override
	public List<Avaluation> findAll() {
		return repository.findAll();
	}

	@Override
	public Avaluation findById(Long id) {
		Optional<Avaluation> avaluation = repository.findById(id); 
		return avaluation.orElseThrow(() -> new NoContentException());
	}

	@Override
	public void insert(Avaluation avaluation) {
		if(avaluation.getId() != null) {
			throw new BusinessException("O ID é diferente de NULL na inclusão");
		}
		repository.save(avaluation);
		
	}

	@Override
	public void update(Long id, Avaluation avaluation) {
		Avaluation avaluationDb = findById(id);
		
		if(avaluationDb.getId().equals(avaluation.getId())) {
			repository.save(avaluation);
		}else {
			throw new BusinessException("Os ID's para alteração são divergentes");
		}
	}

	@Override
	public void delete(Long id) {
		Avaluation avaluationDb = findById(id);
		repository.delete(avaluationDb);
	}

}
