package it.unibo.multithread;

public class StoppableTask implements Runnable {
    private StopSignal stopSignal;
    public StoppableTask() {
        this.stopSignal = new StopSignal();
    }
    @Override
    public void run() {
        while (!stopSignal.shouldStop()) {
            // Esegui il lavoro
            System.out.println("Working...");
        }
    }

    public void kill() {
        stopSignal.requestStop();
    }
}

class StopTaskDemo {
    public static void main(String[] args) throws InterruptedException {
        StoppableTask task = new StoppableTask();
        Thread taskThread = new Thread(task);
        taskThread.start();
        // Lascia che il task lavori per un po'
        Thread.sleep(50);
        // Richiedi di fermare il task
        task.kill();
        taskThread.join();
        System.out.println("Task stopped.");
    }
}