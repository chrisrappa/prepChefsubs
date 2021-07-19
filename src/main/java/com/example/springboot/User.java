package com.example.springboot;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="USERS")
public class User {

  @Id
  @GeneratedValue
  private Long id;

  @Column
  private String userName;

  public User() {};

  public User(String userName) {
    this.userName = userName;
  }


}
//import lombok.Data;
//
//@Data
//
//public class User {
//
//  String name;
//  String type;
//
//
//  public User(String name, String type) {
//    this.name = name;
//    this.type = type;
//  }
//
//}
