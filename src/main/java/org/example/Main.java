package org.example;
/**
 * Main class
 *
 */
public class Main
{
    public static void main( String[] args ) throws InterruptedException {
        Thread thread1 = new MyThread("Поток 1");
        Thread thread2 = new MyThread("Поток 2");
        Thread thread3 = new MyThread("Поток 3");
        Thread thread4 = new MyThread("Поток 4");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        Thread.sleep(15000);
        thread1.interrupt();
        thread2.interrupt();
        thread3.interrupt();
        thread4.interrupt();
    }
}
