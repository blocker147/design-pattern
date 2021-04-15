package com.blocker.designpatterns.non_creational;

import com.blocker.designpatterns.non_creational.composite.Administrator;
import com.blocker.designpatterns.non_creational.composite.Chef;
import com.blocker.designpatterns.non_creational.composite.Cook;
import com.blocker.designpatterns.non_creational.composite.Employee;
import com.blocker.designpatterns.non_creational.composite.Waiter;
import com.blocker.designpatterns.non_creational.iterator.Iterator;

public class Main {
  public static void main(String[] args) {
    Restaurant restaurant = new Restaurant();

    Chef chef = new Chef("Konstantin");
    restaurant.hire(chef);

    Cook cookOne = new Cook("Vladimir");
    Cook cookTwo = new Cook("Ernest");
    Cook cookThree = new Cook("Gleb");
    Cook cookFour = new Cook("Oleg");
    restaurant.hire(cookOne);
    restaurant.hire(cookTwo);
    restaurant.hire(cookThree);
    restaurant.hire(cookFour);

    Waiter waiterOne = new Waiter("July");
    Waiter waiterTwo = new Waiter("Emma");
    restaurant.hire(waiterOne);
    restaurant.hire(waiterTwo);

    waiterOne.addObserver(chef);
    waiterOne.addObserver(cookOne);
    waiterOne.addObserver(cookTwo);
    waiterOne.addObserver(cookThree);
    waiterOne.addObserver(cookFour);

    Administrator administrator = new Administrator("Dasha");
    restaurant.hire(administrator);

    iteratorPatternDemo(restaurant.getIterator());

    observerPatternDemo(waiterOne);
  }

  public static void iteratorPatternDemo(Iterator iterator) {
    System.out.println("---=== iterator + composite pattern demo ===---");
    while (iterator.hasNext()) {
      Employee employee = (Employee) iterator.next();
      System.out.println(employee.getRole() + " - " + employee.getName());
    }
  }

  public static void observerPatternDemo(Waiter waiter) {
    System.out.println("\n---=== observer pattern demo ===---");
    System.out.println(waiter.getName() + " notifying about new order from customer:");
    waiter.newOrderNotification("Customer asked for french fri with hamburger.");
  }
}
