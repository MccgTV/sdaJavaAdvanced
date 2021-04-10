package com.sda.synchronization.counter;

public class CounterApp {
    public static void main(String[] args) {

        // Wspólny counter
        SimpleCounter simpleCounter = new SimpleCounter();

        // Wątki zwiększające/zmniejszające
        IncrementThread incrementThread = new IncrementThread(simpleCounter);
        DecrementThread decrementThread = new DecrementThread(simpleCounter);

        // Start pracy
        incrementThread.start();
        decrementThread.start();

        // Zaczekaj aż wątki skończą pracę

        try {
            incrementThread.join(); // Zaczekaj aż skończy increment
            decrementThread.join(); // Zaczekaj aż skończy decrement
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Clean");
        }

        // Wątki skończyły pracę, wyświetl wynik
        System.out.println("Kierownik: wynik operacji " + simpleCounter.getValue());
    }
}
