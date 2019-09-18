package com.github.shivanikanojia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.shivanikanojia.model.Users;

@Repository
public interface userRepo extends JpaRepository<Users, Long> {

	Users findByUsername(String username);
}
