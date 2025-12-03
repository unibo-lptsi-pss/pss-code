package it.unibo.multithread;

import java.util.LinkedList;
import java.util.Queue;

public class UnboundedBuffer<T> {
    private Queue<T> buffer = new LinkedList<>();
    public synchronized void put(T item) {
        buffer.add(item);
        notify(); // Notifica un consumatore in attesa
    }
    public synchronized T take() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait(); // Aspetta che ci sia un elemento
        }
        return buffer.remove();
    }
}

class UnboundedBufferDemo {
    static void main() {
        UnboundedBuffer<Integer> buffer = new UnboundedBuffer<>();
        for (int i = 0; i < 10; i++) {
            buffer.put(i);
        }
        Thread producer = new Thread(() -> {
            for (int i = 10; i < 20; i++) {
                buffer.put(i);
                System.out.println("Produced: " + i);
            }
        });
        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                try {
                    var item = buffer.take();
                    System.out.println("Consumed: " + item);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        producer.start();
        consumer.start();
    }
}