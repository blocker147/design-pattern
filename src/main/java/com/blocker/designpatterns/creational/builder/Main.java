package com.blocker.designpatterns.creational.builder;

public class Main {
  public static void main(String[] args) {
    Student student =
        Student.builder()
            .withAge(99)
            .withName("Name")
            .withInterest("Technology")
            .withInterest("Sport")
            .build();

    System.out.println(student);

    student.setAge(100);
    student.setName("No name");

    System.out.println(student);
  }
}
