package com.example.springboot.services;

import com.example.springboot.User;
import com.example.springboot.exceptions.UserNotFoundException;
import com.example.springboot.repositories.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

class UserServiceTest {

  @Mock
  UserRepository userRepository;

  @InjectMocks
  UserService userService;

  @BeforeEach
  public void setUp(){
    MockitoAnnotations.initMocks(this);
  }
  
  @Test
  void getUserDetailsWhenEndpointIsUsed() throws Exception{
      given(userRepository.findByUserName("Tom")).willReturn((Optional.of(new User("Tom"))));

      User user = userService.getUserDetails("Tom");
      assertNotNull(user);
      assertEquals("Tom", user.getUserName());
  }
  
  @Test
  void getUserNotFound() {
      given(userRepository.findByUserName("Tom")).willThrow(new UserNotFoundException());

      assertThrows(UserNotFoundException.class, () -> userService.getUserDetails("Tom"));
  }

}