package com.singlefactory;

// 定義女人

public class Female implements Human{
    public void eat() {
        System.out.println("女人吃飯");
    }
    public void sleep() {
        System.out.println("女人睡覺");
    }
    public void beat() {
        System.out.println("女人打豆豆");
    }
}
