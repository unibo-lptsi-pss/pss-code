package it.unibo.io.files;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;

public class UseFile {
	public static final String FILE_NAME =
		System.getProperty("user.home") + File.separator + "deleteme-pss-folder" + File.separator + "myfile.txt";

	private static Iterable<Method> accessors(Class<?> c) throws Exception {
		final Collection<Method> list = new ArrayList<>();
		for (final Method m : c.getMethods()) {
			if (m.getParameterTypes().length == 0
					&& m.getName().matches("is.*|get.*|can.*")) { // REGEX
				list.add(m);
			}
		}
		return list;
	}

	public static void main(String[] args) throws Exception {
		final File f = new File( args.length == 0 ? FILE_NAME : args[0]);
		for (final Method m : accessors(File.class)) {
			System.out.println(m.getName() + " " + m.invoke(f));
		}
	}
}
// REGEX: http://docs.oracle.com/javase/tutorial/essential/regex/
