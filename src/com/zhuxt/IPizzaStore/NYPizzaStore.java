package com.zhuxt.IPizzaStore;

import com.zhuxt.IPizza.NYStyleCheesePizza;
import com.zhuxt.IPizza.NYStyleClamPizza;
import com.zhuxt.IPizza.NYStylePepperionPizza;
import com.zhuxt.IPizza.NYStyleVeggiePizza;
import com.zhuxt.Pizza.*;
import com.zhuxt.PizzaStore.PizzaStore;

/**
 * Created by Administrator on 2015/11/15.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        }else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        }else if (type.equals("pepperion")) {
            return new NYStylePepperionPizza();
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("clam");
    }
}
