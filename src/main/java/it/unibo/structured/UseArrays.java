void main() {
	int[] array = { 10, 20, 30 };
	System.out.println("array: " + array[0] + " " + array[1] + " " + array[2]);
	System.out.println(array); // [I@1794d431};
	System.out.println("c.length: " + array.length); // 3
	String[] words = { "Hello", "World!" };
	words[0] = "Ciao!";
	System.out.println(words[0]);
	// System.out.println(words[2]); --> OutOfBoundException
}
