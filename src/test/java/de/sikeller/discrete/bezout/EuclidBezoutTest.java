package de.sikeller.discrete.bezout;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EuclidBezoutTest {

    private BezoutCoefficients sut;

    @Before
    public void setup() {
        sut = new EuclidBezout();
    }

    @Test
    public void calc() throws Exception {
        assertEquals(new BezoutCoefficientsResult.Pair(-10, 1), sut.calc(10, 101).get());
        assertEquals(new BezoutCoefficientsResult.Pair(1, -10), sut.calc(101, 10).get());
        assertEquals(new BezoutCoefficientsResult.Pair(-2, 3), sut.calc(13, 9).get());
        assertEquals(new BezoutCoefficientsResult.Pair(3, -2), sut.calc(9, 13).get());
        assertEquals(new BezoutCoefficientsResult.Pair(0, 1), sut.calc(9, 3).get());
        assertEquals(new BezoutCoefficientsResult.Pair(1, 0), sut.calc(1, 3).get());
        assertEquals(new BezoutCoefficientsResult.Pair(-80, 83), sut.calc(1024, 987).get());
    }

}