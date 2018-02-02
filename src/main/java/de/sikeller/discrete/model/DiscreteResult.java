package de.sikeller.discrete.model;

public class DiscreteResult extends CalcResult<Integer> {

    private DiscreteResult(boolean validResult, Integer value) {
        super(validResult, value);
    }

    public static DiscreteResult empty() {
        return new DiscreteResult(false, null);
    }

    public static DiscreteResult of(Integer r) {
        return new DiscreteResult(true, r);
    }

}
