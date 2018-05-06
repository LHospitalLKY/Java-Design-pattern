package com.singlefactory;

// 創建男人類

public class Male implements Human{
    public void eat() {
        System.out.println("男人吃飯");
    }
    public void sleep() {
        System.out.println("男人睡覺");
    }
    public void beat() {
        System.out.println("男人打豆豆");
    }
}
