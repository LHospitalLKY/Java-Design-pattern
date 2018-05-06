package com.shiyanlou;

// 大溼兄想定義一些動物，這些動物可以發出叫聲
public class Animal {
    int legNum;
    private int age;
    public int getAge() {
        return this.age;
    }
    public int setAge(int age) {
        this.age = age;
        return this.age;
    }


    // 初始化動物
    public Animal(int legNum){
        this.legNum = legNum;
        System.out.println("我是動物！");
        System.out.println("動物有" + this.legNum + "條腿");
    }

    // 動物會叫
    public void bark(){
        System.out.println("動物叫！");
    }
}
