package com.blocker.designpatterns.behavioral.strategy;

import java.math.BigDecimal;

public class CurrencyExchanger {
  private ExchangeStrategy strategy;

  public CurrencyExchanger() {
    this.strategy = new StandardExchangeStrategy();
  }

  public void setStrategy(ExchangeStrategy strategy) {
    if (strategy != null) {
      this.strategy = strategy;
    } else {
      System.out.println("Using standard exchange strategy");
      this.strategy = new StandardExchangeStrategy();
    }
  }

  public BigDecimal withdrawRequest(BigDecimal amount) {
    return strategy.withdraw(amount);
  }
}
