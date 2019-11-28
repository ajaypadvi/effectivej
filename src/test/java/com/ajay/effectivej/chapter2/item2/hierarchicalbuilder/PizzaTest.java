package com.ajay.effectivej.chapter2.item2.hierarchicalbuilder;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static com.ajay.effectivej.chapter2.item2.hierarchicalbuilder.NyPizza.Size.SMALL;
import static com.ajay.effectivej.chapter2.item2.hierarchicalbuilder.Pizza.Topping.HAM;
import static com.ajay.effectivej.chapter2.item2.hierarchicalbuilder.Pizza.Topping.ONION;
import static com.ajay.effectivej.chapter2.item2.hierarchicalbuilder.Pizza.Topping.SAUSAGE;

public class PizzaTest {

  @Test
  public void testNyStylePizza(){
    NyPizza pizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();
    Objects.requireNonNull(pizza);
  }

  @Test
  public void testCanZoneStylePizza() {
    Calzone calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();
    Objects.requireNonNull(calzone);
  }
}
