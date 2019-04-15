package com.alligator.test;

import com.alligator.single.Singleton02;

public class TestSingleton02 {
    public static void main(String[] args) {
        Singleton02 singleton02 = Singleton02.INSTANCE;
        System.out.println(singleton02);
    }
}
