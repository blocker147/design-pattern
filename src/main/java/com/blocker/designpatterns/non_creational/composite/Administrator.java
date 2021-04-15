package com.blocker.designpatterns.non_creational.composite;

public class Administrator extends AbstractEmployee {
  public Administrator(String name) {
    super(name);
  }

  @Override
  public Role getRole() {
    return Role.ADMINISTRATOR;
  }
}
