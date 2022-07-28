package ru.job4j.function;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DiapFuncTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = DiapFunc.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D, 17D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSquareFunctionThenSquareResults() {
        List<Double> result = DiapFunc.diapason(1, 3, x -> x * x);
        List<Double> expected = Arrays.asList(1D, 4D, 9D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenDegreeFunctionThenDegreeResults() {
        List<Double> result = DiapFunc.diapason(1, 3, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(2D, 4D, 8D);
        assertThat(result, is(expected));
    }
}