package com.blocker.designpatterns.non_creational.iterator;

public interface Iterator {
  boolean hasNext();

  Object next();

  void reset();
}
