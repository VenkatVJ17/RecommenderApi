package com.venkatscode.springboot.recommender_api.controllers;
import java.util.List;

import com.venkatscode.springboot.recommender_api.models.Movie;
import com.venkatscode.springboot.recommender_api.service.RecommendationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RecommendationsController {

	@Autowired
    RecommendationsService service;
	
	@GetMapping("/movies")
//	@RequestMapping(method=RequestMethod.GET, value="/movies")
	public ResponseEntity<List<Movie>> getAllMovies() {
		return new ResponseEntity<>(service.findAll(),HttpStatus.ACCEPTED);
	}

	@PostMapping("/add/movie")
	public ResponseEntity<Void> addMovie(@RequestBody Movie movie){
		try{
			service.save(movie);
		}catch (Exception ex){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PostMapping("/add/movies")
	public ResponseEntity<Void> addMovie(@RequestBody List<Movie> movies){
		try{
			service.saveAll(movies);
		}catch (Exception ex){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}