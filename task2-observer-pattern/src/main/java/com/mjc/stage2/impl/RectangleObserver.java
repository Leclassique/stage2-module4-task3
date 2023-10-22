package com.mjc.stage2.impl;

import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.Rectangle;
import com.mjc.stage2.entity.RectangleValues;
import com.mjc.stage2.event.RectangleEvent;
import com.mjc.stage2.warehouse.RectangleWarehouse;

public class RectangleObserver  implements Observer {
    @Override
    public void handleEvent(RectangleEvent event){
        Rectangle rectangle = event.getSource();
        if (rectangle!= null){
            RectangleValues rectangleWarehouse = RectangleWarehouse.getInstance().get(rectangle.getId());
            rectangleWarehouse.setPerimeter(rectangle.getSideA()*2+ rectangle.getSideB()*2);
            rectangleWarehouse.setSquare(rectangle.getSideA()* rectangle.getSideB());
        }
    }
    // Write your code here!
}
