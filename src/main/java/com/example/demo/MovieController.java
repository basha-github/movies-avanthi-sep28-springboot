package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class MovieController {
	
	@Autowired
	MovieRepo movieRepo;
	
	
	
	@PostMapping("avanthi/movie")
	public String addNewMovie(@RequestBody Movies movies){
		
		System.out.println("From react movie--->"+movies);
		
		
		movieRepo.save(movies);
		
		
		
		return "Suucessfully Add New Movie";
	}

}
