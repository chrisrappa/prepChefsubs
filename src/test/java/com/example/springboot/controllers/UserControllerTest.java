package com.example.springboot.controllers;


import com.example.springboot.User;
import com.example.springboot.exceptions.UserNotFoundException;
import com.example.springboot.services.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = UserController.class)
class UserControllerTest {

  @Autowired
  MockMvc mockMvc;

  @MockBean
  UserService userService;


  @Test
  public void getUserDetailsTest() throws Exception{
    given(userService.getUserDetails(Mockito.anyString())).willReturn(new User("Tom"));
    mockMvc.perform(MockMvcRequestBuilders.get("/users/Tom"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$").isMap())
            .andExpect(jsonPath("userName").value("Tom"));
  }

  @Test
  void userNotFoundHTTPStatus() throws Exception {
    given(userService.getUserDetails(Mockito.anyString())).willThrow(new UserNotFoundException());

    mockMvc.perform(MockMvcRequestBuilders.get("/users/Tom"))
            .andExpect(status().isNotFound());

  }
}