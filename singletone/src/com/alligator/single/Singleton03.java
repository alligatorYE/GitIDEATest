package com.alligator.single;

import java.io.IOException;
import java.util.Properties;

public class Singleton03 {
    public static final Singleton03 INSTANCE;
    private String info;
    static {
        try {
            Properties pro = new Properties();
            pro.load(Singleton03.class.getClassLoader().getResourceAsStream("single.properties"));
            INSTANCE = new Singleton03(pro.getProperty("info"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private Singleton03(String info){
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Singleton03 [info = " + info + " ]";
    }
}
