package com.alligator.single;
/**
*@Description 饿汉式：直接创建实例对象不管是否需要创建这个对象,都会创建
 *              1.构造器私有化
 *              2.自行创建，并用静态变量保存
 *              3.向外提供这个实例
 *              4.强调这是一个单例，可以用final修改
*@Param
*@Return
*@Author alligator YE
*@Date 2019/4/15
*@Time 19:23
*/
public class Singleton01 {
    public static final Singleton01 INSTANCE = new Singleton01();
    private Singleton01(){

    }

}
