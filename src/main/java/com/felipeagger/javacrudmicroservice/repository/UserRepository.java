package com.felipeagger.javacrudmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipeagger.javacrudmicroservice.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> { }