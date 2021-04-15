package com.blocker.designpatterns.non_creational.facade.secondary;

import java.util.Random;

public class TestingService {
  private final Random random;

  public TestingService() {
    this.random = new Random();
  }

  public boolean isTestPassed() {
    boolean result = random.nextBoolean();
    if (result) {
      System.out.println("\tTest passed!");
    } else {
      System.out.println("\tTest not passed");
    }
    return result;
  }
}
