package com.alligator.single;
/**
*@Description 在内部类被加载和初始化时，才创建INSTANCE实例对象
 *             静态内部类不会自动随着外部类加载和初始化而初始化，他是要单独加载和初始化的
 *             因为实在内部类加载和初始化时常见的，所以不存在线程安全问题
*@Param
*@Return 
*@Author alligator YE
*@Date 2019/4/16
*@Time 9:48
*/
public class Singleton06 {
    private  Singleton06(){

    }
    public static class Inner{
        private  static final Singleton06 INSTANCE = new Singleton06();

    }
    public static Singleton06 GetInstance(){
        return Inner.INSTANCE;
    }
}
