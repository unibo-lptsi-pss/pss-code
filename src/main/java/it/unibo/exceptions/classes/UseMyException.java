package it.unibo.exceptions.classes;

public class UseMyException {
    public static void main(String[] s) {
    	try { // attenzione alla formattazione di questo esempio!
    		final int a = Integer.parseInt(s[0]);
    		final int b = Integer.parseInt(s[1]);
    		final var iterator = java.util.List.of(a, b).iterator();
    		System.out.println(iterator.next());
    		System.out.println(iterator.next());
    		System.out.println(iterator.next()); // Exception
    	} catch (Exception e) { // Exception caught!
    		final RuntimeException e2 = new MyException("Re-throwing: " + e, s);
    		throw e2;
    	}
    }
}
/* Esempio: java UseMyException 10 13.1
Exception in thread "main" Failed with arguments: [10, 13.1]
it.unibo.exceptions.classes.MyException:
    Rilancio di: java.lang.NumberFormatException: For input string: "13.1"
	at it.unibo.exceptions.classes.UseMyException.main(UseMyException.java:14)
*/
