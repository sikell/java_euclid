package de.sikeller.discrete.bezout;

public class EuclidBezout implements BezoutCoefficients {

    /**
     * 'Cryptography: Theory and Practice' von Doug Stinson
     *
     * @param a discrete number
     * @param b discrete number
     */
    @Override
    public BezoutCoefficientsResult calc(int a, int b) {
        int r0 = a, r1 = b,
                s0 = 1, s1 = 0, t0 = 0, t1 = 1;
        int q1, r2, s2, t2;
        while (r1 > 0) {
            q1 = Math.floorDiv(r0, r1);
            r2 = r0 - q1 * r1;
            s2 = s0 - q1 * s1;
            t2 = t0 - q1 * t1;
            System.out.println(r0 + " = " + q1 + " * " + r1 + " + " + r2);
            r0 = r1;
            r1 = r2;
            t0 = t1;
            t1 = t2;
            s0 = s1;
            s1 = s2;
        }
        System.out.println(r0 + " = " + s0 + " * " + a + " + " + t0 + " * " + b);
        return BezoutCoefficientsResult.of(s0, t0);
    }

}
