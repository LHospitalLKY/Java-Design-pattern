package com.shiyanlou;

public class TestDog {
    public static void main(String[] args) {
        Animal a = new Animal(4);
        a.bark();
        System.out.println("\n");

        Dog d_1 = new Dog(4);
        d_1.bark(); // 子類可以直接訪問父類的方法
        System.out.println("\n");

        Animal d_2 = new Dog(4);
        d_2.setAge(2);
        d_2.bark();
    }
}
