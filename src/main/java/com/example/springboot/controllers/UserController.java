package com.example.springboot.controllers;

import com.example.springboot.User;
import com.example.springboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users", method = RequestMethod.GET)
public class UserController {

  @Autowired
  UserService userService;

  @GetMapping("/{userName}")
  public ResponseEntity<User> getUserDetails(@PathVariable String userName) throws Exception{

    User user = userService.getUserDetails(userName);
    return new ResponseEntity<>(user, HttpStatus.OK);

  }

}
