package it.unibo.multithread;

public class StopSignal {
    private boolean stop = false;
    public synchronized void requestStop() {
        stop = true;
    }
    public synchronized boolean shouldStop() {
        return stop;
    }
}