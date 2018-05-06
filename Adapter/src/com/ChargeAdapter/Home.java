package com.ChargeAdapter;

// 在家裏充電
public class Home {
    private cnPluginInterface cnPlugin;

    // 初始化類
    public Home() {}
    public Home(cnPluginInterface cnPlugin) {
        this.cnPlugin = cnPlugin;
    }

    // 設置插座
    public cnPluginInterface setPlugin(cnPluginInterface cnPlugin) {
        this.cnPlugin = cnPlugin;
        return this.cnPlugin;
    }

    // 在家裏只能使用兩腳插座來充電
    public void charge() {
        this.cnPlugin.chargeWith2Pins();
    }

}
