package com.singlefactory;

// 定義工廠，通過這個工廠來創建男人類和女人類

public class HumanFactory {
    public Human createHuman(String gender) {
        if (gender.equals("male")) {
            return new Male();
        }
        else if (gender.equals("female")) {
            return new Female();
        }
        else {
            System.out.println("Wrong Gender!");
            return null;
        }
    }
}
