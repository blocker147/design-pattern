package com.blocker.designpatterns.behavioral.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StandardExchangeStrategy implements ExchangeStrategy {

  @Override
  public BigDecimal withdraw(BigDecimal amount) {
    final BigDecimal percent = new BigDecimal("0.05");
    BigDecimal commission = amount.multiply(percent).setScale(2, RoundingMode.CEILING);
    System.out.println("Standard commission is 5% = " + commission);
    return amount.subtract(commission).setScale(2, RoundingMode.CEILING);
  }
}
