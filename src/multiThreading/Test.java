package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test extends Thread{

    volatile int i=1;

    @Override
    public void run(){
       inc();
    }
    public synchronized void inc(){
        i++;
    }
    public void printI(){
        System.out.println(i);
    }
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(100);
        for (int i=0;i<100;i++){
            Test t=new Test();
            executorService.submit(t);
            t.inc();
        }
    }
}
