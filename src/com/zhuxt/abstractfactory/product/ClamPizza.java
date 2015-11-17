package com.zhuxt.abstractfactory.product;

import com.zhuxt.abstractfactory.factory.PizzaIngredientFactory;

/**
 * Created by zxt on 2015/11/18.
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("preParing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.creatSauce();
        cheese = pizzaIngredientFactory.creatCheese();
        clam = pizzaIngredientFactory.createClam();
    }
}
