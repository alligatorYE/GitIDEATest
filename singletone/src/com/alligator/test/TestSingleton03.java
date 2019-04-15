package com.alligator.test;

import com.alligator.single.Singleton03;

public class TestSingleton03 {
    public static void main(String[] args) {
        Singleton03 singleton03 = Singleton03.INSTANCE;
        System.out.println(singleton03);
    }
}
