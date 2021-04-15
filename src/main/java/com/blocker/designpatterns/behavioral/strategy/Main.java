package com.blocker.designpatterns.behavioral.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
  public static void main(String[] args) {
    CurrencyExchanger currencyExchanger = new CurrencyExchanger();

    BigDecimal balance = new BigDecimal("999.12").setScale(2, RoundingMode.CEILING);
    System.out.println("Current balance: " + balance + "\n");

    balance = currencyExchanger.withdrawRequest(balance);
    System.out.println("Balance after (standard) withdraw: " + balance + "\n");

    currencyExchanger.setStrategy(new PremiumExchangeStrategy());
    System.out.println("Setting strategy to premium mode\n");

    balance = currencyExchanger.withdrawRequest(balance);
    System.out.println("Balance after (premium) withdraw: " + balance);
  }
}
