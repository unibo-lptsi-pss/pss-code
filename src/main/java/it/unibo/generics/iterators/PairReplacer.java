package it.unibo.generics.iterators;

public class PairReplacer<X, Y> {

    private final Pair<X, Y> pair;

    public PairReplacer(final Pair<X, Y> pair) {
        this.pair = pair;
    }

    public <Z> Pair<Z, Y> replaceFirst(final Z newFirst) {
        return new Pair<>(newFirst, this.pair.getSecond());
    }

    public <Z> Pair<X, Z> replaceSecond(final Z newSecond) {
        return new Pair<>(this.pair.getFirst(), newSecond);
    }

    static void main() {
        final var replacer = new PairReplacer<>(new Pair<>("Hello", 42));
        final var newFirstPair = replacer.replaceFirst(3.14); // Con inferenza, uso tipico
        System.out.println("Replaced First: " + newFirstPair);
        Pair<String, Boolean> newSecondPair = replacer.<Boolean>replaceSecond(true); // Senza inferenza
        System.out.println("Replaced Second: " + newSecondPair);
    }
}
