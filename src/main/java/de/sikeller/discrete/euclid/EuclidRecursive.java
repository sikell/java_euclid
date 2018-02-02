package de.sikeller.discrete.euclid;

import de.sikeller.discrete.model.DiscreteResult;

public class EuclidRecursive implements GreatestCommonDivisor {

    @Override
    public DiscreteResult calc(int x1, int x2) {
        if (x1 <= 0 || x2 <= 0) {
            return DiscreteResult.empty();
        }
        return recursive(x1, x2);
    }

    private DiscreteResult recursive(int a, int b) {
        if (b == 0) {
            return DiscreteResult.of(a);
        }
        return (recursive(b, a % b));
    }

}
