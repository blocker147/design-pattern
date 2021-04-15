package com.blocker.designpatterns.non_creational.facade;

import com.blocker.designpatterns.non_creational.facade.initial.InitialRecruitmentFacade;
import com.blocker.designpatterns.non_creational.facade.secondary.FurtherRecruitmentFacade;

public class RecruitmentProcessFacade {
  private final InitialRecruitmentFacade initialRecruitmentFacade;
  private final FurtherRecruitmentFacade furtherRecruitmentFacade;

  public RecruitmentProcessFacade(
      InitialRecruitmentFacade initialRecruitmentFacade,
      FurtherRecruitmentFacade furtherRecruitmentFacade) {
    this.initialRecruitmentFacade = initialRecruitmentFacade;
    this.furtherRecruitmentFacade = furtherRecruitmentFacade;
  }

  public boolean startInitialRecruitmentProcess(Participant participant) {
    if (participant.isInitialProcessPassed() || participant.isHired()) {
      return true;
    }
    boolean result = initialRecruitmentFacade.startTesting(participant);
    if (result) {
      participant.setInitialProcessPassed(true);
      System.out.println(
          "Congratulations " + participant.getName() + ", you have passed first recruitment part!");
    }
    return result;
  }

  public boolean startSecondaryRecruitmentProcess(Participant participant) {
    if (participant.isHired()) {
      return true;
    }
    boolean result = false;
    if (participant.isInitialProcessPassed()) {
      result = furtherRecruitmentFacade.startTesting();
      if (result) {
        participant.setHired(true);
        System.out.println("Congratulations " + participant.getName() + ", you are hired!");
      }
    }
    return result;
  }
}
