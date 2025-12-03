package it.unibo.multithread;

public class SynchronizedCounter {
    private int counter = 0;
    public synchronized void increment() {
        counter++;
    }
    public synchronized int getCounter() {
        return counter;
    }
    static Runnable incrementFor(int amount, SynchronizedCounter counter) {
        return () -> {
            for(int i = 0; i < amount; i++) {
                counter.increment();
            }
        };
    }
}

class SynchronizedCounterDemo {
    static void main(String[] args) throws InterruptedException {
        var shared = new SynchronizedCounter();
        var thread1 = new Thread(SynchronizedCounter.incrementFor(1000, shared));
        var thread2 = new Thread(SynchronizedCounter.incrementFor(1000, shared));
        thread1.start();
        thread2.start();
        thread2.join();
        thread1.join();
        System.out.println("Final counter value: " + shared.getCounter());
    }
}