package com.staticfactory;

import com.singlefactory.*;

// 靜態工廠，可以直接使用HumanFactory.create方法，而不需要再單獨定義一個HumanFactory類型變量

public class HumanFactory {
    public static Male createMale() {
        return new Male();
    }
    public static Female createFemle() {
        return new Female();
    }
}
