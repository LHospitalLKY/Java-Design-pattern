package com.Girls;

// 给个子高的妹子加上一个装饰器
public class Tall extends GirlDecorator {
    private final Girl girl;

    // 初始化各自高的女孩
    public Tall(Girl g) {
        girl = g;
    }

    @Override
    // 这个女孩个子高
    public String getDescription() {
        return girl.getDescription() + "+ is very tall";
    }
}
