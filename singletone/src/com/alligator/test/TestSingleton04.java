package com.alligator.test;

import com.alligator.single.Singleton04;

import java.util.concurrent.*;

public class TestSingleton04 {
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

    private static void verifyThreadSafety() throws InterruptedException, java.util.concurrent.ExecutionException {
        Callable<Singleton04> callable = new Callable<Singleton04>() {
            @Override
            public Singleton04 call() throws Exception {
                return Singleton04.getInstance();
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Singleton04> future01 = executorService.submit(callable);
        Future<Singleton04> future02 = executorService.submit(callable);

        Singleton04 singleton0403 = future01.get();
        Singleton04 singleton0404 = future02.get();

        System.out.println(singleton0403 == singleton0404);
        System.out.println(singleton0403);
        System.out.println(singleton0404);
        executorService.shutdown();
    }

    private static void seeInstanceAddressIsSameOne() {
        Singleton04 singleton0401 = Singleton04.getInstance();
        Singleton04 singleton0402 = Singleton04.getInstance();

        System.out.println(singleton0401 == singleton0402);
        System.out.println(singleton0401);
        System.out.println(singleton0402);
    }
}
