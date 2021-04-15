package com.blocker.designpatterns.non_creational.composite;

public abstract class AbstractEmployee implements Employee {
  private final String name;

  protected AbstractEmployee(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
