package it.unibo.interfaces.domo;
import java.io.IO;

public class SubstitutionMain {
    public static void workOnDevice(Device d) { 
        IO.println(d.toString() + " è " + (d.isSwitchedOn() ? "acceso" : "spento")); 
    }

    public static void workOnLamp(Lamp l) { 
        IO.println(l.toString() + " è " + (l.isSwitchedOn() ? "acceso" : "spento")); 
    }

    public static void main(String[] args) {
        Lamp l = new Lamp();
        Device d = l; // ok, ci si attende un Device
        workOnDevice(l); // ok, il parametro dev'essere un Device
        // workOnLamp(d); // NON OK, la variabile d può riferirsi a un qualunque device
    }
}
