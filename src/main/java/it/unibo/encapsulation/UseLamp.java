package it.unibo.encapsulation;
import java.io.IO;

public class UseLamp {
   private static void test1() {
      final Lamp l = new Lamp();
      IO.println(l);
      l.switchOn();
      l.setIntensity(0.5);
      l.dim();
      l.dim();
      IO.println(l);
      l.brighten();
      IO.println(l);
      // Acceso: true Intensità: 0.4
   }

   public static void main(final String[] s) {
      UseLamp.test1();
      // altri test...
   }
}
