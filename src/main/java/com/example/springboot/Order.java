package com.example.springboot;

import java.util.concurrent.atomic.AtomicLong;

public class Order {

  private AtomicLong id;
  private String status;
  private String  info;

  public Order(AtomicLong id, String status, String info) {
    this.id = id;
    this.status = status;
    this.info = info;
  }

}
