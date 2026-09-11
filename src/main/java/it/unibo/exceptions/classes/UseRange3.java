package it.unibo.exceptions.classes;
import java.io.IO;

public class UseRange3 {
    public static void main(String[] s) {
    	RangeIterator r = null; // creabile anche dentro al try..
    	try { // attenzione alla formattazione di questo esempio!
    		final int a = Integer.parseInt(s[0]);
    	    final int b = Integer.parseInt(s[1]);
    	    r = new RangeIterator(a,b);
    	    System.out.print(r.next()+" ");
    	    System.out.print(r.next()+" ");
    	    IO.println(r.next());
    	    throw new Error();
    	} catch (ArrayIndexOutOfBoundsException e) {
    	    IO.println("Servono almeno due argomenti!");
    	} catch (NumberFormatException e) {
    	    IO.println("Servono argomenti interi!");
    	} catch (IllegalArgumentException e) {
    	    IO.println(e);
    	} catch (Exception e) { //ogni altra eccezione
    	    throw e; // rilancio l'eccezione
    	} finally {
    	    // questo codice comunque eseguito
    	    IO.println("bye bye..");
    	}
    }
}
