package com.blocker.designpatterns.structural.decorator.release;

import java.util.Set;

public class CameraReleaseDecorator extends ReleaseDecorator {
  public CameraReleaseDecorator(Release release) {
    super(release);
  }

  @Override
  public Set<Integer> getVersions() {
    release.getVersions().add(4);
    return release.getVersions();
  }

  @Override
  public Set<String> getFunctions() {
    release.getFunctions().add("take a photo");
    return release.getFunctions();
  }
}
