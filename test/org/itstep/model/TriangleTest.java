package org.itstep.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void getArea() {
        Triangle triangle = new Triangle(10,16);
        Assertions.assertEquals(80, triangle.getArea());
    }
}