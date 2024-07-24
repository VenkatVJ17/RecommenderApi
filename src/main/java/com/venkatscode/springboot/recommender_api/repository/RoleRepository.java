package com.venkatscode.springboot.recommender_api.repository;

import com.venkatscode.springboot.recommender_api.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String name);
}
