package com.example.demo.repository;

import com.example.demo.enity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

//    User findByEmail(String email);

    boolean existsByEmail(String email);
    Optional<User> findByEmail(String email);

}
