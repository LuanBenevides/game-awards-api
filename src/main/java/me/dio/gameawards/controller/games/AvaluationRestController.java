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
import me.dio.gameawards.domain.model.Avaluation;
import me.dio.gameawards.service.AvaluationService;

@RestController
@CrossOrigin(origins = "*")
public class AvaluationRestController extends BaseRestController{

	@Autowired
	private AvaluationService businessLayer;
	
	@GetMapping("avaluations")
	public ResponseEntity<List<Avaluation>> findAll(){
		List<Avaluation> avaluations = businessLayer.findAll();
		return ResponseEntity.ok(avaluations);
	}
	
	@GetMapping("avaluations/{id}")
	public ResponseEntity<Avaluation> findById(@PathVariable Long id){
		return ResponseEntity.ok(businessLayer.findById(id));
	}
	
	@PostMapping("avaluations")
	public ResponseEntity<Avaluation> insert(@RequestBody Avaluation avaluation){
		businessLayer.insert(avaluation);
		
		return ResponseEntity.ok(avaluation);
	}
	
	@PutMapping("avaluations/{id}")
	public ResponseEntity<Avaluation> insert(@PathVariable Long id ,@RequestBody Avaluation avaluation){
		businessLayer.update(id, avaluation);
		return ResponseEntity.ok(avaluation);
	}
	
	@DeleteMapping("avaluations/{id}")
	public ResponseEntity<Avaluation> delete(@PathVariable Long id){
		businessLayer.delete(id);
		return ResponseEntity.ok().build();
	}
}
