package com.blocker.designpatterns.non_creational.composite;

import com.blocker.designpatterns.non_creational.observer.OrderObserver;

public class Chef extends AbstractEmployee implements OrderObserver {
  public Chef(String name) {
    super(name);
  }

  @Override
  public Role getRole() {
    return Role.CHEF;
  }

  @Override
  public void notifyAboutNew(String order) {
    System.out.println("Notifying " + super.getName() + " about order: " + order);
  }
}
