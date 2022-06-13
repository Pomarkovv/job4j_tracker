package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenFirst12Second2Third3Fourth6Max12() {
        int result = Max.max(12, 2, 3, 6);
        int expected = 12;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenFirst3Second2Third1Fourth0Max3() {
        int result = Max.max(3, 2, 1, 0);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

}