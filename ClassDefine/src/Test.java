import com.shiyanlou.People;

public class Test {
    public static void main(String[] args) {
        People Xiaojiejie = new People(1.62, 22, 1);

        System.out.println("小姐姐說：");
        // 小姐姐哭了
        Xiaojiejie.cry();
        // 小姐姐笑了
        Xiaojiejie.laugh();
        // 我是小姐姐
        Xiaojiejie.printBaseMes();
        System.out.println("\n");


        People The_king_of_fool = new People();
        System.out.println("我是傻子之王！");
        The_king_of_fool.setHeight(1.50);
        The_king_of_fool.setAge(30);
        The_king_of_fool.setSex(0);
        The_king_of_fool.printBaseMes();
    }
}
