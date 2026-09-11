class Food {
    String name;
    boolean eatean;

    void consume() {
        if (!eatean) {
            eatean = true;
        } else {
            IO.println(name + " already consumed");
        }
    }
}

class MicrowaveOven {
    String model;   // modello del microonde
    int time;       // tempo di cottura in secondi
    int power;      // potenza in watt
    Food content;   // cibo attualmente nel forno
    boolean on;     // forno attivo o meno

    void setPower(int power) {
        if (power >= 150 && power <= 800) {
            this.power = power;
        } else {
            IO.println("Invalid power value, it must be between 150 and 800");
        }
    }

    void setTime(int time) {
        if (time >= 0 && time <= 120) { // 2 minuti
            this.time = time;
        } else {
            IO.println("Invalid time value, it must be between 0 and 120");
        }
    }

    void insertFood(Food content) {
        if (!content.eatean && !on) {
            this.content = content;
        } else {
            IO.println("Cannot place this food!");
        }
    }

    Food getContent() { // apro il forno
        if (on && time > 0 && power > 0) {
            on = false; // spengo il microonde
            Food cookedFood = content;
            content = null; // rimuovo il cibo
            return cookedFood;
        } else {
            IO.println("Cannot get oven content!");
            return null;
        }
    }

    void start() {
        if (!on && time > 0 && power > 0) {
            on = true;
        } else {
            IO.println("On is already set");
        }
    }

    void off() {
        if (on) {
            on = false;
        } else {
            IO.println("Off is already set");
        }
    }
}
void main() {
    Food pasta = new Food();
    pasta.name = "Pasta al Sugo";
    MicrowaveOven oven = new MicrowaveOven();
    oven.model = "Hotpoint Ariston";
    // Messaggi
    oven.setPower(200);
    oven.setTime(60);
    oven.insertFood(pasta);
    // Leggi lo stato
    IO.println(oven.model);
    IO.println(oven.power);
    IO.println(oven.time);
    IO.println(oven.content.name);
    oven.start();
    Food cookedPasta = oven.getContent();
    cookedPasta.consume();
    IO.println("Pasta consumed? " + cookedPasta.eatean);
}