package me.dio.gameawards.domain.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.gameawards.domain.model.Avaluation;

@Repository
public interface AvaluationRepository extends JpaRepository<Avaluation, Long>{

}
