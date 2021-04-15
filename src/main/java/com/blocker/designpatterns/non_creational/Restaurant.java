package com.blocker.designpatterns.non_creational;

import com.blocker.designpatterns.non_creational.composite.Employee;
import com.blocker.designpatterns.non_creational.iterator.Aggregate;
import com.blocker.designpatterns.non_creational.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Aggregate {
  private final List<Employee> employees = new ArrayList<>();

  public void hire(Employee employee) {
    employees.add(employee);
  }

  @Override
  public Iterator getIterator() {
    return new EmployeeIterator();
  }

  private final class EmployeeIterator implements Iterator {
    private int index = 0;

    @Override
    public boolean hasNext() {
      if (index < employees.size()) {
        return true;
      }
      reset();
      return false;
    }

    @Override
    public void reset() {
      index = 0;
    }

    @Override
    public Object next() {
      return employees.get(index++);
    }
  }
}
