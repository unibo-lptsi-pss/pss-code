package it.unibo.patterns.decorator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.*;

import it.unibo.patterns.decorator.Mushrooms;
import it.unibo.patterns.decorator.GlutFree;
import it.unibo.patterns.decorator.Margherita;
import it.unibo.patterns.decorator.Sausage;

/*
 * Considerare l'interfaccia Pizza e l'implementazione Margherita, con costo 6.50 Euro e ingredienti Mozzarella + Pomodoro.
 * Si vuole fornire la possibilità di aggiungere gli ingredienti Funghi (maggiorazione di 1 Euro) e Salsiccia 
 * (maggiorazione di 1.5 Euro), eventualmente anche in porzione doppia (p.e., doppia porzioni di funghi: 2 Euro).
 * Inoltre, la Pizza potrebbe anche essere "stesa", nel qual caso la maggiorazione è del 10% sul costo totale.
 * Queste variazioni vadano fornite attraverso il pattern "Decorator", ossia una Pizza con funghi e/o salsiccia e/o stesa
 * sia una decorazione di un pizza.
 * Si realizzino quindi le classi Funghi, Salsiccia e GlutFree come decoratori di Pizza, e quindi da usare in modo che il 
 * test qui sotto sia soddisfatto: si noti in particolare come se ne usano i costruttori.
 * Nel realizzare le classi si faccia attenzione a evitare il più possibile il codice duplicato, fattorizzando in 
 * classi astratte ovunque sia utile.
 * Per semplicità si assuma che la decorazione GlutFree venga applicata solo una volta e in posizione più esterna, 
 * come nel caso del test qui sotto, e senza ulteriori controlli.
 * Si consideri il test qui sotto (da scommentare) come riferimento.
  */

public class TestPizzas {
	
	@Test
	public void test(){
		Pizza p1 = new Mushrooms(new Sausage(new Margherita()));
		Pizza p2 = new Margherita();
		Pizza p3 = new Sausage(new Sausage(new Margherita())); // Ingrediente usato due volte (ossia doppio)
		Pizza p4 = new GlutFree(new Sausage(new Sausage(new Margherita())));
		// stampe di comodo
		System.out.println(p1.getCost()+" "+p1.getIngredients());
		System.out.println(p2.getCost()+" "+p2.getIngredients());
		System.out.println(p3.getCost()+" "+p3.getIngredients());
		System.out.println(p4.getCost()+" "+p4.getIngredients());
		// test correttezza di costi e stringhe
		assertEquals(p1.getCost(),900); // 6.50 + 1.00 + 1.50
		assertEquals(p2.getCost(),650);
		assertEquals(p3.getCost(),950); // 6.50 + 1.50 + 1.50
		assertEquals(p4.getCost(),1045);// (6.50 + 1.50 + 1.50) + 10%
		assertEquals(p1.getIngredients(),"Tomato, Mozzarella, Sausage, Mushrooms");
		assertEquals(p2.getIngredients(),"Tomato, Mozzarella");
		assertEquals(p3.getIngredients(),"Tomato, Mozzarella, Sausage, Sausage");
		assertEquals(p4.getIngredients(),"[GF] Tomato, Mozzarella, Sausage, Sausage");	
	}
}
