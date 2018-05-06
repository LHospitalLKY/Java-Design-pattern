package com.foodfactory;

public class Foodaholic {
    public void eat(KitchenFactory k) {
        System.out.println("一個" + k.getFood().getFoodName()
                + "正在被小姐姐用" + k.getTableWare().getToolName() + "吃");
    }

    public static void main(String[] args) {
        Foodaholic fh = new Foodaholic();
        // 想要使用fh，需要先來一個具體的KitchenFactory類型，即AKitchen
        AKitchen ak = new AKitchen();
        fh.eat(ak);
    }
}
