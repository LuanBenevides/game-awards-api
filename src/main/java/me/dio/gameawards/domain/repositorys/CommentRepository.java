package me.dio.gameawards.domain.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.gameawards.domain.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{

}
