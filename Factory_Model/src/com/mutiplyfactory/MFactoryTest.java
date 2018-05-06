package com.mutiplyfactory;

import com.singlefactory.*;

public class MFactoryTest {
    public static void main(String[] args) {
        HumanFactory factory = new HumanFactory();
        Female female = factory.createFemale();
        female.eat();
        female.sleep();
        female.beat();
    }
}
