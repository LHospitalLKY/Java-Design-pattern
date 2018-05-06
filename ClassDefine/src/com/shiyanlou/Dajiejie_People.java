package com.shiyanlou;

public class Dajiejie_People {
    // 給小姐姐創建一位閨蜜叫大姐姐，大姐姐與小姐姐不同，大姐姐使用靜態內部類來訪問自己的作爲一個學生的信息
    private String name = new String("石原里美");
    static String ID = new String("No. 4");
    /*static靜態變量爲整個類所有，既可以通過對象名稱訪問，又可以通過類名訪問*/

    // 大姐姐講student作爲靜態內部類
    public static class student{
        private String ID = new String("6010300141");

        public void stuInfo(){
            System.out.println("我的名字叫" + new Dajiejie_People().name);   //大姐姐的名字不是靜態變量，因此在靜態內部類中要先創建大姐姐
            System.out.println("我的社會ID是" + Dajiejie_People.ID);
            System.out.println("我的學號是" + ID);
        }
    }

    // 大姐姐要測試一下自己
    public static void main(String[] args){
        // 創建大姐姐爲學生
        student b = new student();
        b.stuInfo();
    }

}
