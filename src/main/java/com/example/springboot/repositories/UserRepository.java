package com.example.springboot.repositories;

import com.example.springboot.User;

import java.util.Optional;

public interface UserRepository {

  public Optional<User> findByUserName(String userName);

}
