package com.foodfactory;

// 抽象食物
interface Food {
    public String getFoodName();
}

// 抽象餐具
interface TableWare {
    public String getToolName();
}

// 抽象廚房
interface KitchenFactory {
    public Food getFood();
    public TableWare getTableWare();
}

