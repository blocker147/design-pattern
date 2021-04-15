package com.blocker.designpatterns.non_creational.facade.secondary;

public class FurtherRecruitmentFacade {
  private final TestingService testingService;
  private final InterviewService interviewService;

  public FurtherRecruitmentFacade(
      TestingService testingService, InterviewService interviewService) {
    this.testingService = testingService;
    this.interviewService = interviewService;
  }

  public boolean startTesting() {
    return testingService.isTestPassed() && interviewService.isInterviewPassed();
  }
}
