void main() throws InterruptedException {
    Thread t1 = new Thread(() -> System.out.println("Thread 1"));
    Thread t2 = new Thread(() -> System.out.println("Thread 2"));
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    System.out.println("after join");
    System.out.println("Tutti i thread hanno finito!");
}