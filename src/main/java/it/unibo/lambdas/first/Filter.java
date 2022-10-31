package it.unibo.lambdas.first;

public interface Filter<X> {
	// Does element x pass the filter?
	boolean applyFilter(X x);
}
