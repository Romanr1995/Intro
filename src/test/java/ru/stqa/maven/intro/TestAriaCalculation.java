package ru.stqa.maven.intro;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class TestAriaCalculation {

    @Test
    public void canCanculateSquareArea() {

        assertEquals(5.0,new Circle(2.0).area(),0.00001);
    }
}
