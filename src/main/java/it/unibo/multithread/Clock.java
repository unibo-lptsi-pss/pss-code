package it.unibo.multithread;

public class Clock implements Runnable {
    private String name;
    private int amount;
    public Clock(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
    @Override
    public void run() {
        while(true) {
            System.out.println("Clock " + name + ": " + System.currentTimeMillis());
            try {
                Thread.sleep(this.amount); // Pausa di 1 secondo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static void main(String[] args) {
        Clock clock1 = new Clock("A", 500);
        Thread thread1 = new Thread(clock1);
        thread1.start();
        Clock clock2 = new Clock("B", 1000);
        Thread thread2 = new Thread(clock2);
        thread2.start();
    }
}
