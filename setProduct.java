import java.util.Scanner;

public class setProduct {
    public static void main(String[] args) {

        System.out.println("商品名,　重さ,　数,　材質");

        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        double weight = scan.nextDouble();
        int ecount = scan.nextInt();
        String material = scan.next();

        System.out.println("商品名:" + name);
        System.out.println("weight:" + weight + "kg");
        System.out.println("数:" + ecount + "個");
        System.out.println("材質:" + material);
        
        double mcount = weight * ecount;

        System.out.println("総重量:" + mcount + "kg");
    }
}
