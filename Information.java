// import java.util.List;
// import java.util.jar.Attributes.Name;
// import java.util.Iterator;

public class Information {
    private static String name;
    private static double weight;
    private static double mcount;
    private static double ecount;
    private static String[] material = {"SCM415", "SCM420", "SCM435", "S45C"};
    
/*
    public void Information(String name, int weight, String[] material) {
        this.name = name;
        this.weight = weight;
        this.material = material;
        this.mcount = mcount;
        this.ecount = ecount;
    }
*/
    public static void main(String[] args) {
        //引数で指定した情報を持つ商品を作成
        
        weight = Double.parseDouble(args[1]);
        ecount = Double.parseDouble(args[2]); //String型の引数の重さ・数量をdouble型に変換
        mcount = weight * ecount;
        boolean gear = args[0].contains("gear");
        boolean mat1 = (gear) && (weight < 3.0);
        boolean mat2 = (gear) && (3.0 <= weight);
        name = args[0];

        if (args.length == 3) {
            System.out.println("商品名:" + name);
            System.out.println("weight:" + args[1] + "kg");
            System.out.println("数:" + args[2] + "個");
            System.out.println("総重量:" + mcount + "kg");

            if (mat1) {
            System.out.println("材質:" + material[0]);
            } else if (mat2) {
            System.out.println("材質:" + material[1]);
            } else {
            System.out.println("材質:" + material[2]);
            }
        } else {
            System.out.println("入力が不正です");
        }

        

        //後は、Informationで作成した商品をインスタンス化し、セット作成用のデータベース配列に格納すれば完成
        //何故か42~のelse if文が機能しない
    }
}
