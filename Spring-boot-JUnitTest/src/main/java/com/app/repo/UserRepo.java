package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.app.entity.User;


public interface UserRepo extends JpaRepository<User, Integer>{


}
