package com.ChargeAdapter;

// 建立英標接口與國標接口的適配器，最終講英標接口轉換成國標接口
public class PluginAdapter implements cnPluginInterface {
    private enPluginInterface enPlugin;
    public enPluginInterface getEnPlugin() {
        return enPlugin;
    }
    public enPluginInterface setEnplugin(enPluginInterface enPlugin) {
        this.enPlugin = enPlugin;
        return this.enPlugin;
    }

    // 初始化
    // public void PluginAdapter() {}
    public PluginAdapter(enPluginInterface enPlugin) {
        this.enPlugin = enPlugin;
    }

    // 構建chargeWith2Pins
    public void chargeWith2Pins() {
        System.out.println("使用適配器轉換：");
        this.enPlugin.chargeWith3Pins();
    }
}
