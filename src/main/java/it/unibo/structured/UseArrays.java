void main() {
	int[] array = { 10, 20, 30 };
	IO.println("array: " + array[0] + " " + array[1] + " " + array[2]);
	IO.println(array); // [I@1794d431};
	IO.println("c.length: " + array.length); // 3
	String[] words = { "Hello", "World!" };
	words[0] = "Ciao!";
	IO.println(words[0]);
	// IO.println(words[2]); --> OutOfBoundException
}
