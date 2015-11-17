package com.zhuxt.abstractfactory;


import com.zhuxt.abstractfactory.product.Pizza;

/**
 * Created by Administrator on 2015/11/15.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println("get a pizza");
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
