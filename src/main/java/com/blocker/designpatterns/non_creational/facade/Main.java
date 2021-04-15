package com.blocker.designpatterns.non_creational.facade;

import com.blocker.designpatterns.non_creational.facade.initial.InitialRecruitmentFacade;
import com.blocker.designpatterns.non_creational.facade.initial.ResumeService;
import com.blocker.designpatterns.non_creational.facade.initial.VacancyService;
import com.blocker.designpatterns.non_creational.facade.secondary.FurtherRecruitmentFacade;
import com.blocker.designpatterns.non_creational.facade.secondary.InterviewService;
import com.blocker.designpatterns.non_creational.facade.secondary.TestingService;

public class Main {
  public static void main(String[] args) {
    VacancyService vacancyService = new VacancyService();
    ResumeService resumeService = new ResumeService();
    InitialRecruitmentFacade initialRecruitmentFacade =
        new InitialRecruitmentFacade(vacancyService, resumeService);

    TestingService testingService = new TestingService();
    InterviewService interviewService = new InterviewService();
    FurtherRecruitmentFacade furtherRecruitmentFacade =
        new FurtherRecruitmentFacade(testingService, interviewService);

    RecruitmentProcessFacade recruitmentProcessFacade =
        new RecruitmentProcessFacade(initialRecruitmentFacade, furtherRecruitmentFacade);

    Participant participant = new Participant(10, "Ilja");

    recruitmentProcessFacade.startInitialRecruitmentProcess(participant);

    recruitmentProcessFacade.startSecondaryRecruitmentProcess(participant);
    recruitmentProcessFacade.startSecondaryRecruitmentProcess(participant);
    recruitmentProcessFacade.startSecondaryRecruitmentProcess(participant);
  }
}
