package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        ArrayDeque<Integer> order = new ArrayDeque<>();
        for (int i = 0; i < numberOfDishes; i++) {
            order.addLast(i + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numberOfDishes; i++) {
            for (int j = 0; j < everyDishNumberToEat; j++) {
                if (j == everyDishNumberToEat - 1) {
                    result.add(order.removeFirst());
                    break;
                }
                order.addLast(order.removeFirst());
            }
        }
        return result;
    }
}
