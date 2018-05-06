package com.shiyanlou;

public class People {
    // 定義類的屬性，爲了更好的分裝性，我們講類的屬性定義爲private，使用getter和setter方法來給外部提供訪問接口
    private double height;
    public double getHeight(){
        return height;
    }
    public double setHeight(double height){
        this.height = height;
        return height;
    }

    private int age;
    public int getAge(){
        return age;
    }
    public int setAge(int age){
        this.age = age;
        return age;
    }

    private int sex;
    public int getSex(){
        return sex;
    }
    public int setSex(int sex){
        this.sex = sex;
        return sex;
    }

    // 定義方法
    public void cry(){
        System.out.println("I'm crying");
    }
    public void laugh(){
        System.out.println("I'm laughing");
    }
    public void printBaseMes(){
        System.out.println("我的身高是" + height + "cm");
        System.out.println("我的年齡是" + age + "歲");
        // 打印性別
        if (this.sex == 0)
            System.out.println("我的性別是男");
        else
            System.out.println("我的性別是女");
    }

    // 構造方法，構造方法名稱與類的名稱相同，且無返回值。如果沒有構造方法，系統會自動給出一個構造方法
    public People(){
        height = 1.75;
        age = 18;
        sex = 1;
    }
    public People(double h, int a, int s){
        height = h;
        age = a;
        sex = s;
    }
}
