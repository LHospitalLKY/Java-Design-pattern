package com.foodfactory;

public class AKitchen implements KitchenFactory {
    public Food getFood() {
        return new Apple();     // 抽象類不能使用new定義
    }
    public TableWare getTableWare() {
        return new Knife();
    }
}
