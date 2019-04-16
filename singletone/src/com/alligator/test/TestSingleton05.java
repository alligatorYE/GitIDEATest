package com.alligator.test;

import com.alligator.single.Singleton05;

import java.util.concurrent.*;

public class TestSingleton05 {
    public static void main(String[] args) {

//        seeInstanceAddressIsSameOne();


        try {
            verifyThreadSafety();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

    private static void verifyThreadSafety() throws InterruptedException, ExecutionException {
        Callable<Singleton05> callable = new Callable<Singleton05>() {
            @Override
            public Singleton05 call() throws Exception {
                return Singleton05.getInstance();
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Singleton05> future01 = executorService.submit(callable);
        Future<Singleton05> future02 = executorService.submit(callable);

        Singleton05 Singleton0503 = future01.get();
        Singleton05 Singleton0504 = future02.get();

        System.out.println(Singleton0503 == Singleton0504);
        System.out.println(Singleton0503);
        System.out.println(Singleton0504);
        executorService.shutdown();
    }

    private static void seeInstanceAddressIsSameOne() {
        Singleton05 Singleton0501 = Singleton05.getInstance();
        Singleton05 Singleton0502 = Singleton05.getInstance();

        System.out.println(Singleton0501 == Singleton0502);
        System.out.println(Singleton0501);
        System.out.println(Singleton0502);
    }
}
