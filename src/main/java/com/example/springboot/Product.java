package com.example.springboot;

public class Product {

  private String name;
  private String  image;
  private double price;
  private String description;
  private int rating;
  private int inventory;

  public Product(String name, String image, double price, String description, int rating, int inventory) {
    this.name = name;
    this.image = image;
    this.price = price;
    this.description = description;
    this.rating = rating;
    this.inventory = inventory;
  }
}
