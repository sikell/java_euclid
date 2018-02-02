package de.sikeller.discrete.euclid;

import de.sikeller.discrete.model.DiscreteResult;

public class EuclidIterative implements GreatestCommonDivisor {

    @Override
    public DiscreteResult calc(int x1, int x2) {
        if (x1 <= 0 || x2 <= 0) {
            return DiscreteResult.empty();
        }
        return iterative(x1, x2);
    }

    private DiscreteResult iterative(int x1, int x2) {
        int r, a = x1, b = x2;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return DiscreteResult.of(a);
    }

}
