package com.ChargeAdapter;

public class HomeTest {
    public static void main(String[] args) {
        // 先創建一個國標插座;
        cnPluginInterface cnPlugin = new cnPlugin();
        Home h1 = new Home(cnPlugin);
        h1.charge();

        // 在家裏使用適配器，使得從香港買的iphone6可以充電
        enPluginInterface enPlugin = new enPlugin();
        Home h2 = new Home();
        cnPluginInterface pa = new PluginAdapter(enPlugin);
        h2.setPlugin(pa);
        h2.charge();
    }
}
