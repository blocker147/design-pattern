package com.blocker.designpatterns.non_creational.facade.initial;

public class ResumeService {
  public boolean isResumeAccepted(int workingExperience) {
    int demandedWorkingExperience = 10;
    boolean result = demandedWorkingExperience <= workingExperience;
    if (result) {
      System.out.println("\tNice, you have enough work experience!");
    } else {
      System.out.println(
          "\tSorry, we are looking for a person with "
              + demandedWorkingExperience
              + " years of experience");
    }
    return result;
  }
}
