package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to33Then4DOT24() {
        int x1 = 0, y1 = 0, x2 = 3, y2 = 3;
        double expected = 4.24;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to99Then9DOT89() {
        int x1 = 2, y1 = 2, x2 = 9, y2 = 9;
        double expected = 9.89;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2222to7889Then87DOT32() {
        int x1 = 22, y1 = 22, x2 = 78, y2 = 89;
        double expected = 87.32;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when55to1111Then8DOT48() {
        int x1 = 5, y1 = 5, x2 = 11, y2 = 11;
        double expected = 8.48;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when015to2237Then31DOT11() {
        int x1 = 0, y1 = 15, x2 = 22, y2 = 37;
        double expected = 31.11;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when0100to2005688then5591DOT57() {
        int x1 = 0, y1 = 100, x2 = 200, y2 = 5688;
        double expected = 5591.57;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}

