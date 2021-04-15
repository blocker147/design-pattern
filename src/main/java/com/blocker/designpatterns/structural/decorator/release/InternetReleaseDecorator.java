package com.blocker.designpatterns.structural.decorator.release;

import java.util.Set;

public class InternetReleaseDecorator extends ReleaseDecorator {
  public InternetReleaseDecorator(Release release) {
    super(release);
  }

  @Override
  public Set<Integer> getVersions() {
    release.getVersions().add(3);
    return release.getVersions();
  }

  @Override
  public Set<String> getFunctions() {
    release.getFunctions().add("access to the internet");
    return release.getFunctions();
  }
}
