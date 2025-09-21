package it.unibo.lifecycle.modeling;

public class GameConfig {
    private final int attempts;
    private final int minGuesses;
    private final int maxGuesses;

    public GameConfig(int attempts, int minGuesses, int maxGuesses) {
        this.attempts = attempts;
        this.minGuesses = minGuesses;
        this.maxGuesses = maxGuesses;
    }

    public int getAttempts() {
        return this.attempts;
    }

    public int getMinGuesses() {
        return this.minGuesses;
    }

    public int getMaxGuesses() {
        return this.maxGuesses;
    }
}
