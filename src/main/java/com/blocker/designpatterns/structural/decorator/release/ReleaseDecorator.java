package com.blocker.designpatterns.structural.decorator.release;

import java.util.Set;

public abstract class ReleaseDecorator implements Release {
  protected final Release release;

  protected ReleaseDecorator(Release release) {
    this.release = release;
  }

  @Override
  public Set<Integer> getVersions() {
    return release.getVersions();
  }

  @Override
  public Set<String> getFunctions() {
    return release.getFunctions();
  }
}
