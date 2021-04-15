package com.blocker.designpatterns.structural.decorator;

import com.blocker.designpatterns.structural.decorator.release.DefaultRelease;
import com.blocker.designpatterns.structural.decorator.release.Release;

import java.util.Collections;

public class Phone {
  private final String model;
  private Release release;

  public Phone(String model) {
    this.model = model;
    this.release = new DefaultRelease();
  }

  public void setRelease(Release release) {
    this.release = release;
  }

  public Release getRelease() {
    return release;
  }

  @Override
  public String toString() {
    return model
        + " "
        + Collections.max(release.getVersions())
        + " has following functions: "
        + release.getFunctions();
  }
}
