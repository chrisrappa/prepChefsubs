package com.example.springboot.services;

import com.example.springboot.User;
import com.example.springboot.exceptions.UserNotFoundException;
import com.example.springboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

  @Autowired
  UserRepository userRepository;

  public User getUserDetails(String userName) {

    User user = null;
//    This is using Optional to return an empty object instead of a null value
    Optional<User> optionalUser = userRepository.findByUserName(userName);
    if(optionalUser.isPresent()){
      user = optionalUser.get();
    } else {
      throw new UserNotFoundException();
    }

    return user;
  }
}
