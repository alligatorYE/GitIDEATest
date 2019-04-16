package com.alligator.single;
/**
*@Description 懒汉式： 延迟创建实例对象
 *              1.构造器私有化
 *              2.用静态变量保存这个唯一的实例
 *              3.提供一个静态方法，获取这个实例对象
 *              使用synchronized 线程同步，解决线程安全问题
*@Param
*@Return
*@Author alligator YE
*@Date 2019/4/16
*@Time 8:22
*/
public class Singleton05 {
    static Singleton05 instance;
    private Singleton05(){
        
    }
    
    public static Singleton05 getInstance() {
        if (instance == null) {

        }
        if (instance == null) {

            synchronized (Singleton05.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new Singleton05();
                }
            }
        }
        return instance;
    }
}
