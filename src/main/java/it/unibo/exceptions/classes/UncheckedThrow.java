package it.unibo.exceptions.classes;

public class UncheckedThrow {
    public static void main(String[] args) {
    	final int[] a = new int[]{ 10, 20, 30 };
    	accessArray(a, 1); // OK
    	accessArray(a, 3); // Eccezione
    }

    public static int accessArray(final int[] array, final int pos) {
    	if (pos < 0 || pos >= array.length) {
    		final String msg = "Accesso fuori dai limiti, in posizione " + pos;
    		throw new IllegalArgumentException(msg);
    	}
    	return array[pos];
    }
}

/* Stampa dell'errore:

Exception in thread "main" java.lang.IllegalArgumentException: Accesso fuori dai limiti, in posizione 3
	at it.unibo.apice.oop.p13exceptions.classes.UncheckedThrow.accessArray(UncheckedThrow.java:13)
	at it.unibo.apice.oop.p13exceptions.classes.UncheckedThrow.main(UncheckedThrow.java:7)
*/
