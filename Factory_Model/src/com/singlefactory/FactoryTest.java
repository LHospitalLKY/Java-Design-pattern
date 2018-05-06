package com.singlefactory;

public class FactoryTest {
    public static void main(String[] args) {
        HumanFactory factory = new HumanFactory();
        Human male = factory.createHuman("male");   // createHuman的返回值類型是Human，而不是
        male.eat();
        male.sleep();
        male.beat();
    }
}
