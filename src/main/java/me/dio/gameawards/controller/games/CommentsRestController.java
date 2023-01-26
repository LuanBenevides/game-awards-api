package me.dio.gameawards.controller.games;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import me.dio.gameawards.controller.BaseRestController;
import me.dio.gameawards.domain.model.Comment;
import me.dio.gameawards.service.CommentService;

@RestController
@CrossOrigin(origins = "*")
public class CommentsRestController extends BaseRestController{

	@Autowired
	private CommentService businessLayer;
	
	@GetMapping("comments")
	public ResponseEntity<List<Comment>> findAll(){
		List<Comment> comments = businessLayer.findAll();
		return ResponseEntity.ok(comments);
	}
	
	@GetMapping("comments/{id}")
	public ResponseEntity<Comment> findById(@PathVariable Long id){
		return ResponseEntity.ok(businessLayer.findById(id));
	}
	
	@PostMapping("comments")
	public ResponseEntity<Comment> insert(@RequestBody Comment comment){
		businessLayer.insert(comment);
		
		return ResponseEntity.ok(comment);
	}
	
	@PutMapping("comments/{id}")
	public ResponseEntity<Comment> insert(@PathVariable Long id ,@RequestBody Comment comment){
		businessLayer.update(id, comment);
		return ResponseEntity.ok(comment);
	}
	
	@DeleteMapping("comments/{id}")
	public ResponseEntity<Comment> delete(@PathVariable Long id){
		businessLayer.delete(id);
		return ResponseEntity.ok().build();
	}
}
