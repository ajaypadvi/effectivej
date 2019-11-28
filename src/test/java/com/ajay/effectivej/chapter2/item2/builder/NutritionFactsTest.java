package com.ajay.effectivej.chapter2.item2.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NutritionFactsTest {

  @Test
  public void testNutritionFacts() {
    NutritionFacts cocaCola =
        new NutritionFacts.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
    Assertions.assertEquals(240, cocaCola.getServingSize());
    Assertions.assertEquals(8, cocaCola.getServings());
    Assertions.assertEquals(100, cocaCola.getCalories());
    Assertions.assertEquals(35, cocaCola.getSodium());
    Assertions.assertEquals(27, cocaCola.getCarbohydrate());
  }
}
