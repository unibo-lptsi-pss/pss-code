void main() throws InterruptedException {
    Thread t1 = new Thread(() -> IO.println("Thread 1"));
    Thread t2 = new Thread(() -> IO.println("Thread 2"));
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    IO.println("after join");
    IO.println("Tutti i thread hanno finito!");
}