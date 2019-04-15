package com.alligator.test;

import com.alligator.single.Singleton01;

public class TestSingleton01 {
    public static void main(String[] args) {
        Singleton01 singleton01 = Singleton01.INSTANCE;
        System.out.println(singleton01);
    }
}
