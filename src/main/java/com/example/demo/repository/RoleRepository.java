package com.example.demo.repository;

import com.example.demo.enity.Permission;
import com.example.demo.enity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
}
