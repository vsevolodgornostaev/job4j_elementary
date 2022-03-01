package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int p = 6;
        double k = 2;
        int expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10DOT5K2DOT22Square5DOT90() {
        double p = 10.5;
        double k = 2.22;
        double expected = 5.90;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP33DOT57K115DOT84Square2DOT39() {
        double p = 33.57;
        double k = 115.84;
        double expected = 2.39;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K3Square3() {
        int p = 8;
        int k = 3;
        double expected = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}