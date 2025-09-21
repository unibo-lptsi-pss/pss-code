
class Food {
    String name;     // tipo di cibo, es. "Pasta al sugo"
    boolean eatean; // true se il cibo è stato mangiato
}

class MicrowaveOven {
    String model;   // modello del microonde
    int time;       // tempo di cottura in secondi
    int power;      // potenza in watt
    Food content;   // cibo attualmente nel forno
    boolean on;     // forno attivo o meno
}

void main() {
    MicrowaveOven oven = new MicrowaveOven();
    oven.model = "HotPoint Ariston";
    oven.time = 60;
    oven.power = 800;
    oven.content = new Food(); // new Food() è un'espressione!
    oven.content.name = "Pasta al sugo"; // Posso accedere ai campi di content!
    oven.on = true;
    oven.content.eatean = true;
    System.out.println(oven.model); // stampa "HotPoint Ariston"
    System.out.println(oven.content.name); // stampa "Pasta al sugo"
    System.out.println(oven.power); // stampa 800
    System.out.println(oven.time); // stampa 60
    System.out.println(oven.on); // stampa true
}
