package de.sikeller.discrete.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.util.function.Supplier;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
public abstract class CalcResult<A> {

    private final boolean hasResult;
    private final A result;

    public final A get() {
        if (hasResult) {
            return result;
        }
        throw new IllegalStateException("You can not access the value, cause of invalid calculation.");
    }

    public final A getOrElse(Supplier<A> orElse) {
        return (hasResult) ? result : orElse.get();
    }

    public boolean hasResult() {
        return hasResult;
    }

}
