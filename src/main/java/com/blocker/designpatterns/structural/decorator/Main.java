package com.blocker.designpatterns.structural.decorator;

import com.blocker.designpatterns.structural.decorator.release.CameraReleaseDecorator;
import com.blocker.designpatterns.structural.decorator.release.InternetReleaseDecorator;
import com.blocker.designpatterns.structural.decorator.release.MessageReleaseDecorator;

public class Main {
  public static void main(String[] args) {
    Phone iPhone = new Phone("iPhone");
    System.out.println(iPhone);

    iPhone.setRelease(new MessageReleaseDecorator(iPhone.getRelease()));
    System.out.println(iPhone);

    iPhone.setRelease(new InternetReleaseDecorator(iPhone.getRelease()));
    System.out.println(iPhone);

    iPhone.setRelease(new CameraReleaseDecorator(iPhone.getRelease()));
    System.out.println(iPhone);
  }
}
