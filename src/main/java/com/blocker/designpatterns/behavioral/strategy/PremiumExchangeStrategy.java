package com.blocker.designpatterns.behavioral.strategy;

import java.math.BigDecimal;

public class PremiumExchangeStrategy implements ExchangeStrategy {

  @Override
  public BigDecimal withdraw(BigDecimal amount) {
    System.out.println("Premium commission is 0%");
    return amount;
  }
}
