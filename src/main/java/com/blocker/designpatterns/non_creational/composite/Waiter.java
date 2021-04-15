package com.blocker.designpatterns.non_creational.composite;

import com.blocker.designpatterns.non_creational.observer.Observable;
import com.blocker.designpatterns.non_creational.observer.OrderObserver;

import java.util.HashSet;
import java.util.Set;

public class Waiter extends AbstractEmployee implements Observable {
  private final Set<OrderObserver> observers = new HashSet<>();

  public Waiter(String name) {
    super(name);
  }

  @Override
  public Role getRole() {
    return Role.WAITER;
  }

  @Override
  public void addObserver(OrderObserver observer) {
    observers.add(observer);
  }

  public void newOrderNotification(String order) {
    observers.forEach(observer -> observer.notifyAboutNew(order));
  }
}
