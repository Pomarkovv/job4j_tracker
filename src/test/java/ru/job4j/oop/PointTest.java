package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenX11Y11Z24then2() {
        Point a = new Point(1, 1, 2);
        Point b = new Point(1, 1, 4);
        double rsl = a.distance3d(b);
        double expected = 2;
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenX21Y16Z24then5() {
        Point a = new Point(2, 1, 2);
        Point b = new Point(1, 6, 4);
        double rsl = a.distance3d(b);
        double expected = 5.47;
        Assert.assertEquals(expected, rsl, 0.01);
    }
}