package com.zhuxt.abstractfactory;



import com.zhuxt.abstractfactory.factory.NYPizzaIngredientFactory;
import com.zhuxt.abstractfactory.factory.PizzaIngredientFactory;
import com.zhuxt.abstractfactory.product.CheesePizza;
import com.zhuxt.abstractfactory.product.ClamPizza;
import com.zhuxt.abstractfactory.product.Pizza;

/**
 * Created by zxt on 2015/11/18.
 */
public class NYPizzaStore extends PizzaStore {

    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");

        }else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");

        }
        return pizza;
    }

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");
        Pizza pizza = nyPizzaStore.createPizza("cheese");

    }
}
