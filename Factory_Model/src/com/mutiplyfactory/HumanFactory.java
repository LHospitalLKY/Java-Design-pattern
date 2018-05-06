package com.mutiplyfactory;

import com.singlefactory.*;

// 所謂多工廠，就是在工廠類中爲不同的類建立不同的構造函數

public class HumanFactory {
    public Male createMale() {  // 建立一個男人
        return new Male();
    }
    public Female createFemale() {
        return new Female();
    }
}
