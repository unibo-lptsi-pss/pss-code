package it.unibo.collections.generic.abstractions;
import java.io.IO;

public class ShowCast {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.addElement("a");
		v.addElement("b");
		v.addElement("c");
		Object o = v;
		Vector<Integer> v2 = (Vector<Integer>)o; // unchecked warning
		// Da qui in poi siamo in situazione "pericolosa"
		// Cosa può succedere?
		IO.println(v2.getElementAt(0));
		IO.println(v2.getElementAt(0).intValue());
	}
}
