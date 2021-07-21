package com.example.springboot.repositories;

import com.example.springboot.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class UserRepositoryTest {

  @Autowired
  private UserRepository userRepository;

  @Test
  public void findByUserName() {

    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    System.out.println(userRepository.findAll());

    Optional<User> user = userRepository.findByUserName("Tom");
    assertTrue(user.isPresent());

  }

  @Test
  public void findByUserNameNotFound () {

    Optional<User> user = userRepository.findByUserName("George");
    assertFalse(user.isPresent());
      
  }


}