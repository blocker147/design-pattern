package com.blocker.designpatterns.structural.decorator.release;

import java.util.Set;

public interface Release {
  Set<Integer> getVersions();

  Set<String> getFunctions();
}
