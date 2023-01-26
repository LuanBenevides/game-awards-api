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
import me.dio.gameawards.domain.model.User;
import me.dio.gameawards.service.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserRestController extends BaseRestController{

	@Autowired
	private UserService businessLayer;
	
	@GetMapping("users")
	public ResponseEntity<List<User>> findAll(){
		List<User> users = businessLayer.findAll();
		return ResponseEntity.ok(users);
	}
	
	@GetMapping("users/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		return ResponseEntity.ok(businessLayer.findById(id));
	}
	
	@PostMapping("users")
	public ResponseEntity<User> insert(@RequestBody User user){
		businessLayer.insert(user);
		
		return ResponseEntity.ok(user);
	}
	
	@PutMapping("users/{id}")
	public ResponseEntity<User> insert(@PathVariable Long id ,@RequestBody User user){
		businessLayer.update(id, user);
		return ResponseEntity.ok(user);
	}
	
	@DeleteMapping("users/{id}")
	public ResponseEntity<User> insert(@PathVariable Long id){
		businessLayer.delete(id);
		return ResponseEntity.ok().build();
	}
}
