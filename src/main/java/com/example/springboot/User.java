package com.example.springboot;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "USERS")

public class User {

  @Id
  @GeneratedValue
  private Long id;

  @Column
  private String userName;

  public User(String userName) {
    this.userName = userName;
  }

//  This app is using getters/setters, how do we do this with OOP principles instead?

  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
}
