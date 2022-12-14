package it.unibo.exceptions.classes;

public class UncheckedThrow2 {
    public static void main(String[] args) {
    	final int[] a = new int[] { 10, 20, 30 };
    	accessArray(a,1); // OK
    	accessArray(a,3); // Eccezione
    }

    public static int accessArray(final int[] array, final int pos) {
    	if (pos < 0 || pos >= array.length) {
    		final String msg = "Accesso fuori dai limiti, in posizione " + pos;
    		final RuntimeException e = new java.lang.IllegalArgumentException(msg);
    		throw e;
    	}
    	return array[pos];
    }
}
