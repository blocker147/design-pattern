package com.blocker.designpatterns.non_creational.facade.initial;

import com.blocker.designpatterns.non_creational.facade.Participant;

public class InitialRecruitmentFacade {
  private final VacancyService vacancyService;
  private final ResumeService resumeService;

  public InitialRecruitmentFacade(VacancyService vacancyService, ResumeService resumeService) {
    this.vacancyService = vacancyService;
    this.resumeService = resumeService;
  }

  public boolean startTesting(Participant participant) {
    if (!vacancyService.isVacancyFree()) {
      return false;
    }

    return resumeService.isResumeAccepted(participant.getWorkingExperience());
  }
}
