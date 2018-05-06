package com.Girls;

// 给妹子加上金发
public class GoldenHair extends GirlDecorator {
    private final Girl girl;

    // 初始化金发类：让girl等于g
    public GoldenHair(Girl g) {
        girl = g;
    }

    @Override
    // 给妹子加上金发
    public String getDescription() {
        return girl.getDescription() + "+ with golden hair";
    }
}
