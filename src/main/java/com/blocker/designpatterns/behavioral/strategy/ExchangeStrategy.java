package com.blocker.designpatterns.behavioral.strategy;

import java.math.BigDecimal;

public interface ExchangeStrategy {
  BigDecimal withdraw(BigDecimal amount);
}
