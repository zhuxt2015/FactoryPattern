package com.zhuxt.abstractfactory.factory;

import com.zhuxt.abstractfactory.ingredient.*;

/**
 * Created by zxt on 2015/11/18.
 */
public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce creatSauce();

    public Cheese creatCheese();

    public Veggies createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();
}
