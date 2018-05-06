package com.shiyanlou;

// 主要說明外部類和內部類
public class Xiaojiejie_People {
    // 小姐姐作爲外部類，有一個名字，這個名字需要封裝起來，外部的人不能隨便知道小姐姐的名字
    private String name = new String("劉亦菲");
    // 小姐姐發現自己還是一個學生，作爲一個學生，就有一個學號，而這個學號更不能讓別人隨便知道，因此再做一個內部類
    public class student{
        private String ID = new String("1410030106");

        // 小姐姐提供了接口讓需要的人獲取自己的信息
        public void studInfo(){
            System.out.println("我的名字是" + name);
            System.out.println("我的學號是" + this.ID);
        }
    }

    // 小姐姐想測試一下自己的類和內部類
    public static void main(String[] args){
        // 創建一個稱爲劉亦菲的小姐姐
        Xiaojiejie_People liuyifei = new Xiaojiejie_People();
        // 劉亦菲是一個學生
        student b = liuyifei.new student();
        // 小姐姐想要知道自己的姓名和學號
        b.studInfo();

    }
}
