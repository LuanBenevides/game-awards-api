package me.dio.gameawards.domain.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.gameawards.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
