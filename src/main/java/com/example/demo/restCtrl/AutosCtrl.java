package com.example.demo.restCtrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modeldto.Auto;
import com.example.demo.repository.AutoRepository;

@RestController
@RequestMapping("/Autos")
public class AutosCtrl {
	@Autowired
	AutoRepository autoRe;
	
	@PostMapping
	Auto add(@RequestBody Auto a) {
		return autoRe.save(a);
	}
	
	@GetMapping
	List<Auto> read(){
		return (List<Auto>) autoRe.findAll();
	}
	
	@PutMapping
	Auto update(@RequestBody Auto a) {
		return autoRe.save(a);
	}
	
	@DeleteMapping
	boolean delete(@RequestParam("id") Long id) {
		try {
			autoRe.deleteById(id);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	

}
