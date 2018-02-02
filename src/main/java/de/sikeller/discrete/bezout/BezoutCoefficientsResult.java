package de.sikeller.discrete.bezout;

import de.sikeller.discrete.model.CalcResult;
import lombok.Data;

public class BezoutCoefficientsResult extends CalcResult<BezoutCoefficientsResult.Pair> {

    @Data
    static class Pair {
        private final int first;
        private final int second;
    }

    private BezoutCoefficientsResult(boolean validResult, Pair value) {
        super(validResult, value);
    }

    static BezoutCoefficientsResult empty() {
        return new BezoutCoefficientsResult(false, null);
    }

    static BezoutCoefficientsResult of(Integer a, Integer b) {
        return new BezoutCoefficientsResult(true, new Pair(a, b));
    }

}
