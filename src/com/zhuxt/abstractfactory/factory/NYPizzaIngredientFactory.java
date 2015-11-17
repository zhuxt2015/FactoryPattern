package com.zhuxt.abstractfactory.factory;

import com.zhuxt.abstractfactory.ingredient.*;

/**
 * Created by zxt on 2015/11/18.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrusDough();
    }

    @Override
    public Sauce creatSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese creatCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies createVeggies() {
        return new otherVeggies();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new otherPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
