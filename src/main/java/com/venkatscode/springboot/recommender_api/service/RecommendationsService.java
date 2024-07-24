package com.venkatscode.springboot.recommender_api.service;

import com.venkatscode.springboot.recommender_api.models.Movie;
import com.venkatscode.springboot.recommender_api.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationsService {
    @Autowired
    MovieRepository repo;
    public void save(Movie movie) {
        repo.save(movie);
    }

    public List<Movie> findAll() {
        return repo.findAll();
    }

    public void saveAll(List<Movie> movies) {
        repo.saveAll(movies);
    }
}
