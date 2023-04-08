package com.mocktest.mocktest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mocktest.mocktest.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
