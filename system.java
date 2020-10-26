import java.util.Scanner;

public class system {
    /**
     * メインクラス
     * 
     * @param args
     */

    public static void main(String[] args) {

        // 標準入力で入力させる
        // 定数にしない？
        double price = 0;
        int cost = 5000;

        // String priceStr = inputWord("値段を入力してください");
        // 入力値に問題がないかチェックメソッドを作り呼ぶ
        // costについても同様に

        // MAPではなくクラスでもつ
        Product pr = new Product();
        Pattern pt = new Pattern();

        double[] array = { pr.LongShaft + pr.sprocket + pr.SmallGear + pr.shaft };
        double sum = java.util.Arrays.stream(array).sum();
        double result = pr.LongShaft * 10 + pr.sprocket * 20 + pr.SmallGear * 50 + pr.shaft * 6;
        // int time; // 不要？

        if (result >= 500) {
            System.out.println("Overweight");
        } else {
            System.out.println("weight: " + result + "kg");
            if (result < 500 & result >= 201) {
                price = result * 25 - cost;
                System.out.println("price: " + (int) price + "yen");
            } else {
                System.out.println("Error");
            }
        }

        if (sum / array.length >= 7) {
            System.out.println("pattern: 1");
            System.out.println("加熱時間は" + pt.ptn_one + "分です。");
            // time = pattern.get("1");
        } else if (sum / array.length < 7 & sum / array.length >= 4) {
            System.out.println("pattern: 2");
            System.out.println("加熱時間は" + pt.ptn_two + "分です。");
            // time = pattern.get("2");
        } else if (sum / array.length < 4) {
            System.out.println("pattern: 3");
            System.out.println("加熱時間は" + pt.ptn_three + "分です。");
            // time = pattern.get("3");
        }
    }

    /**
     * 標準入力
     * 
     * @param text =入力させる前に表示させる文字
     */
    public static String inputWord(String text) {
        Scanner scan = new Scanner(System.in);
        String rtWord = scan.nextLine();

        System.out.println("入力値:" + rtWord);
        scan.close();
        return rtWord;
    }

    /**
     * プロダクトクラス
     */
    public static class Product {
        double LongShaft = 10;
        double BigGear = 8;
        double gear = 6;
        double shaft = 5;
        double sprocket = 3;
        double SmallGear = 1.5; // 3/2 =1.5
    }

    /**
     * パターン
     */
    public static class Pattern {
        int ptn_one = 300;
        int ptn_two = 180;
        int ptn_three = 120;
    }
}
