import java.util.InputMismatchException;
import java.util.Scanner;

public class setProduct {
    public static void main(String[] args) {

        System.out.println("商品名,　重さ,　数,　材質");
        Scanner scan = new Scanner(System.in);
        String name = "";
        double weight = 0.0;
        int ecount = 0;
        String material = "";

        try {
            name = scan.next();
            weight = scan.nextDouble();
            ecount = scan.nextInt();
            material = scan.next();
        } catch (InputMismatchException e) {
            System.out.println("入力値に誤りがあります");
            System.exit(0);
        }
        // scanは終了させる。
        scan.close();
        
        System.out.println("商品名:" + name);
        System.out.println("weight:" + weight + "kg");
        System.out.println("数:" + ecount + "個");
        System.out.println("材質:" + material);
        double mcount = weight * ecount;

        System.out.println("総重量:" + mcount + "kg");
    }
}
