package com.example.atc.repo;

import com.example.atc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT COUNT(u) > 0 FROM User u WHERE u.username = ?1 AND u.password = ?2 AND u.role = ?3")
    boolean isValidUser(String username, String password, String role);
}
