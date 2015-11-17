package com.zhuxt.abstractfactory.product;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.zhuxt.abstractfactory.factory.PizzaIngredientFactory;

/**
 * Created by zxt on 2015/11/18.
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("preParing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.creatSauce();
        cheese = pizzaIngredientFactory.creatCheese();
    }
}
