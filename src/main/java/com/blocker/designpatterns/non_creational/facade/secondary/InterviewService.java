package com.blocker.designpatterns.non_creational.facade.secondary;

import java.util.Random;

public class InterviewService {
  private final Random random;

  public InterviewService() {
    this.random = new Random();
  }

  public boolean isInterviewPassed() {
    boolean result = random.nextBoolean();
    if (result) {
      System.out.println("\tInterview passed successfully!");
    } else {
      System.out.println("\tWe will call you back");
    }
    return result;
  }
}
