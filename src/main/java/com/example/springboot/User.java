package com.example.springboot;




public class User {


  private Long id;


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
