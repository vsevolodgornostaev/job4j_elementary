package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to33Then4DOT24() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 3);
        double out = a.distance(b);
        double expected = 4.24;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to99Then9DOT89() {
        Point a = new Point(2, 2);
        Point b = new Point(9, 9);
        double out = a.distance(b);
        double expected = 9.89;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2222to7889Then87DOT32() {
        Point a = new Point(22, 22);
        Point b = new Point(78, 89);
        double out = a.distance(b);
        double expected = 87.32;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when55to1111Then8DOT48() {
        Point a = new Point(5, 5);
        Point b = new Point(11, 11);
        double out = a.distance(b);
        double expected = 8.48;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when015to2237Then31DOT11() {
        Point a = new Point(0, 15);
        Point b = new Point(22, 37);
        double out = a.distance(b);
        double expected = 31.11;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when0100to2005688then5591DOT57() {
        Point a = new Point(0, 100);
        Point b = new Point(200, 5688);
        double out = a.distance(b);
        double expected = 5591.57;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when002to337Then6DOT55() {
        Point a = new Point(0, 0, 2);
        Point b = new Point(3, 3, 7);
        double out = a.distance3d(b);
        double expected = 6.55;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when225to9910Then11DOT09() {
        Point a = new Point(2, 2, 5);
        Point b = new Point(9, 9, 10);
        double out = a.distance3d(b);
        double expected = 11.09;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when222255to788978Then90DOT29() {
        Point a = new Point(22, 22, 55);
        Point b = new Point(78, 89, 78);
        double out = a.distance3d(b);
        double expected = 90.29;
        Assert.assertEquals(expected, out, 0.01);
    }
}

