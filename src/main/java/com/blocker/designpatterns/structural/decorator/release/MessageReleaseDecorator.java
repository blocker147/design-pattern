package com.blocker.designpatterns.structural.decorator.release;

import java.util.Set;

public class MessageReleaseDecorator extends ReleaseDecorator {
  public MessageReleaseDecorator(Release release) {
    super(release);
  }

  @Override
  public Set<Integer> getVersions() {
    release.getVersions().add(2);
    return release.getVersions();
  }

  @Override
  public Set<String> getFunctions() {
    release.getFunctions().add("send a message");
    return release.getFunctions();
  }
}
