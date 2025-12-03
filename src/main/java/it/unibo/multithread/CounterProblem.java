public class Counter {
    private int counter = 0;
    public void increment() {
        counter++;
    }
    public int getCounter() {
        return counter;
    }
    public static Runnable incrementFor(int amount, Counter counter) {
        return () -> {
            for(int i = 0; i < amount; i++) {
                counter.increment();
            }
        };
    }
}
void main() throws InterruptedException {
    var shared = new Counter();
    var thread1 = new Thread(Counter.incrementFor(1000, shared));
    var thread2 = new Thread(Counter.incrementFor(1000, shared));
    thread1.start();
    thread2.start();
    thread2.join();
    thread1.join();
    System.out.println("Final counter value: " + shared.getCounter());
}