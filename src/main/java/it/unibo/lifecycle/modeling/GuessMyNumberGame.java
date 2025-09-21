package it.unibo.lifecycle.modeling;

public class GuessMyNumberGame {
    private final GameConfig config;
    private final NumberPicker numberPicker;
    private final IOManager io;

    public GuessMyNumberGame(GameConfig config, NumberPicker numberPicker, IOManager io) {
        this.config = config;
        this.numberPicker = numberPicker;
        this.io = io;
    }

    public void play() {
        int secret = numberPicker.pickNumber(config.getMinGuesses(), config.getMaxGuesses());
        for (int attempt = 1; attempt <= config.getAttempts(); attempt++) {
            io.printLine("Attempt no. " + attempt);
            io.printLine("Insert your guess (" + config.getMinGuesses() + "–" + config.getMaxGuesses() + "):");
            int guess = io.readIntInRange(config.getMinGuesses(), config.getMaxGuesses());
            if (guess == secret) {
                io.printLine("You won!!");
                return;
            }
            if (guess > secret) {
                io.printLine("Your guess is greater..");
            } else {
                io.printLine("Your guess is lower..");
            }
        }
        io.printLine("Sorry, you lost!");
    }
}
