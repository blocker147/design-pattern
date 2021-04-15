package com.blocker.designpatterns.non_creational.facade.initial;

import java.util.Random;

public class VacancyService {
  private final Random random;

  public VacancyService() {
    this.random = new Random();
  }

  public boolean isVacancyFree() {
    boolean result = random.nextBoolean();
    if (result) {
      System.out.println("\tYou are lucky we have one free vacation!");
    } else {
      System.out.println("\tSorry, no free vacancy for now");
    }
    return result;
  }
}
