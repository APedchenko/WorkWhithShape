package org.itstep;

import org.itstep.model.Circle;
import org.itstep.model.Shape;
import org.itstep.model.Square;
import org.itstep.model.Triangle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ApplicationRunner {
    public static void main(String[] args) {
        Circle circle = new Circle(15);
        Triangle triangle = new Triangle(10, 8);
        Square square = new Square(18);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        shapeList.add(triangle);
        shapeList.add(square);
        System.out.println("Size of queue is " + shapeList.size());

        Set<Shape> shapeSet = new HashSet<>(shapeList);
        shapeSet.add(circle);
        shapeSet.add(triangle);
        shapeSet.add(square);
        System.out.println("Size of set is " + shapeSet.size());

        /*circle.setRadius(15);
        System.out.println("Circle has radius " + circle.getRadius());
        System.out.println("Circle has area " + circle.getArea());*/

        /*String str = "str1";
        String[] strings = new String[3];
        strings[0] = "str";
        strings[1] = "str2";
        strings[2] = "str3";*/


    }
}
