package com.a77.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Customer {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String firstname;

  private String lastname;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return firstname;
  }

  public void setName(String name) {
    this.firstname = name;
  }

  public String getEmail() {
    return lastname;
  }

  public void setEmail(String email) {
    this.lastname = email;
  }
}