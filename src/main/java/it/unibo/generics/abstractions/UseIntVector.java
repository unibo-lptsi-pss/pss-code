package it.unibo.generics.abstractions;

public class UseIntVector {
	public static void main(String[] s) {
		final IntVector vi = new IntVector();
		// Serie di Fibonacci: fib(0)=fib(1)=1, fib(N)=fib(N-1)+fib(N-2) if N>1
		vi.addElement(1);
		vi.addElement(1);
		for (int i = 0; i < 20; i++) {
			vi.addElement(
				vi.getElementAt(vi.getLength() - 1) + // ultimo
				vi.getElementAt(vi.getLength() - 2)   // penultimo
			);
		}
		System.out.println(vi);
		// |1|1|2|3|5|8|13|21|34|55|89|144|233|..
		// 377|610|987|1597|2584|4181|6765|10946|17711|
	}
}
