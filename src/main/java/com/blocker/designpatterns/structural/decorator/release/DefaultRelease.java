package com.blocker.designpatterns.structural.decorator.release;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DefaultRelease implements Release {
  private final Set<String> functions = new LinkedHashSet<>(Collections.singleton("make a call"));
  private final Set<Integer> versions = new HashSet<>(Collections.singleton(1));

  @Override
  public Set<Integer> getVersions() {
    return versions;
  }

  @Override
  public Set<String> getFunctions() {
    return functions;
  }
}
