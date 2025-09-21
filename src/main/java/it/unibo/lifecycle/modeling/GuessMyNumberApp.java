import it.unibo.lifecycle.modeling.GuessMyNumberGame;
import it.unibo.lifecycle.modeling.IOManager;
import it.unibo.lifecycle.modeling.GameConfig;
import it.unibo.lifecycle.modeling.NumberPicker;

void main() {
    GameConfig config = new GameConfig(10, 1, 100);
    NumberPicker numberPicker = new NumberPicker();
    IOManager consoleManager = new IOManager();
    GuessMyNumberGame game = new GuessMyNumberGame(config, numberPicker, consoleManager);
    game.play();
}