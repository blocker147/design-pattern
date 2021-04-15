package com.blocker.designpatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Student {
  private String name;
  private int age;
  private final List<String> interests;

  public Student() {
    this.interests = new ArrayList<>();
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" + "name='" + name + '\'' + ", age=" + age + ", interests=" + interests + '}';
  }

  public static StudentBuilder builder() {
    return new StudentBuilder();
  }

  public static final class StudentBuilder {
    private final Student student;

    public StudentBuilder() {
      this.student = new Student();
    }

    public StudentBuilder withName(String name) {
      student.name = name;
      return this;
    }

    public StudentBuilder withAge(int age) {
      student.age = age;
      return this;
    }

    public StudentBuilder withInterest(String interest) {
      student.interests.add(interest);
      return this;
    }

    public Student build() {
      return student;
    }
  }
}
