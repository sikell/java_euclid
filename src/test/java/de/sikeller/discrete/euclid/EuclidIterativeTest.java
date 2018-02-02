package de.sikeller.discrete.euclid;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class EuclidIterativeTest {

    private GreatestCommonDivisor sut;

    @Before
    public void setup() {
        sut = new EuclidRecursive();
    }

    @Test
    public void calcIterative() throws Exception {
        assertEquals(1, sut.calc(1, 2).get().intValue());
        assertEquals(3, sut.calc(3, 9).get().intValue());
        assertEquals(2, sut.calc(4, 6).get().intValue());
        assertEquals(1, sut.calc(5, 7).get().intValue());
        assertEquals(3, sut.calc(6, 9).get().intValue());
        assertEquals(1, sut.calc(3, 5).get().intValue());
    }

    @Test
    public void calcRecursiveIllegalArgs() throws Exception {
        assertFalse(sut.calc(0, -2).hasResult());
        assertFalse(sut.calc(-2, 0).hasResult());
        assertFalse(sut.calc(-2, -2).hasResult());
        assertFalse(sut.calc(0, 2).hasResult());
        assertFalse(sut.calc(2, 0).hasResult());
        assertFalse(sut.calc(0, 0).hasResult());
    }

}