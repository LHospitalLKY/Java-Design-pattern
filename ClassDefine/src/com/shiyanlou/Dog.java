package com.shiyanlou;

/*  大溼兄想要一個狗，這個狗可以繼承前面的Animal類
    繼承可以減少代碼的冗餘
 */
public class Dog extends Animal {
    // 可能在intelliJIDEA中，需要在子類中增加建立方法，否則會報錯
    public Dog(int legNum) {
        super(legNum);
        System.out.println("我是狗！");
    }

    // Dog有自己獨特的叫聲，這種子類和父類的關係稱爲
    public void bark() {
        System.out.println("汪汪汪！");
    }
}
