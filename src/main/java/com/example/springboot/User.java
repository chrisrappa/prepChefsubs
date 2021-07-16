package com.example.springboot;

public class User {

  String name;
  String email;
  String address;
  String paymentMethod;
  Boolean isAdmin;
  String subscriptionStatus;

  public User(String name, String email, String address, String paymentMethod, Boolean isAdmin, String subscriptionStatus) {
    this.name = name;
    this.email = email;
    this.address = address;
    this.paymentMethod = paymentMethod;
    this.isAdmin = isAdmin;
    this.subscriptionStatus = subscriptionStatus;
  }

}
