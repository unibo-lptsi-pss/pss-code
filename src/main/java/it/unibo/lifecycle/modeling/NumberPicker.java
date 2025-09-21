package it.unibo.lifecycle.modeling;
import java.util.Random;
public class NumberPicker {
    private final Random random;
    public NumberPicker() {
        random = new Random();
    }

    public NumberPicker(int seed) {
        random = new Random(seed);
    }

    public int pickNumber(int minInclusive, int maxExclusive) {
        return random.nextInt((maxExclusive - minInclusive) + 1) + minInclusive;
    }
}
