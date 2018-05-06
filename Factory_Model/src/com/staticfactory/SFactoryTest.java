package com.staticfactory;

import com.singlefactory.*;

public class SFactoryTest {
    public static void main(String[] args) {
        Human female = HumanFactory.createFemle();
        female.eat();
        female.sleep();
        female.beat();
    }
}
