public class PrintTriangle {
    public static void main(String[] args){
        // 創建新的PrintTriangle對象
        PrintTriangle a = new PrintTriangle();

        // 記錄最後一個數字
        int lastNum;

        lastNum = a.printRightTriangle(10);

        System.out.println("最後的太陽：" + lastNum);
    }

    // 函數定義
    public int printRightTriangle(int n){
        // 初始化last
        int last = 0;

        // 打印三角形
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                last++;
                System.out.printf("%d ", last);
            }

            // 打印回車
            System.out.println();
        }

        return last;
    }
}
