package com.venkatscode.springboot.recommender_api.repository;

import com.venkatscode.springboot.recommender_api.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer> {

}
