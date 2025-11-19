package it.unibo.lambdas.first;

// Similar to java.util.functions.Predicate<T>
public interface Filter<X> {
    boolean applyFilter(X x); // Does element x pass the filter?
}
