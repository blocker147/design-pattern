package com.blocker.designpatterns.non_creational.facade;

public class Participant {
  private boolean isInitialProcessPassed;
  private boolean isHired;
  private final int workingExperience;
  private final String name;

  public Participant(int workingExperience, String name) {
    this.workingExperience = workingExperience;
    this.name = name;
  }

  public int getWorkingExperience() {
    return workingExperience;
  }

  public String getName() {
    return name;
  }

  public boolean isInitialProcessPassed() {
    return isInitialProcessPassed;
  }

  public void setInitialProcessPassed(boolean initialProcessPassed) {
    isInitialProcessPassed = initialProcessPassed;
  }

  public boolean isHired() {
    return isHired;
  }

  public void setHired(boolean hired) {
    isHired = hired;
  }
}
