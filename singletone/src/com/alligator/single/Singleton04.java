package com.alligator.single;
/**
*@Description 懒汉式： 延迟创建实例对象
 *              1.构造器私有化
 *              2.用静态变量保存这个唯一的实例
 *              3.提供一个静态方法，获取这个实例对象
*@Param
*@Return
*@Author alligator YE
*@Date 2019/4/16
*@Time 8:22
*/
public class Singleton04 {
    static Singleton04 instance;
    private Singleton04(){
        
    }
    
    public static Singleton04 getInstance(){
        if (instance == null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Singleton04();
        }
        return instance;
    }
}
