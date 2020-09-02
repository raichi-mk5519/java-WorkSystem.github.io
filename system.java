import java.util.HashMap;

public class system {
    
    public static void main(String[] args) {
        HashMap<String, Integer> product = new HashMap<String, Integer>();
        product.put("LongShaft", 10);
        product.put("BigGear", 8);
        product.put("gear", 6);
        product.put("shaft", 5);
        product.put("sprocket", 3);
        product.put("SmallGear", 3/2);

        HashMap<String, Integer> pattern = new HashMap<String, Integer>();
        pattern.put("1", 300);
        pattern.put("2", 180);
        pattern.put("3", 120);

        int price = 0;
        int cost = 5000;
        int[] array = {product.get("LongShaft"), product.get("sprocket"), 
        product.get("SmallGear"), product.get("shaft")};
        int result = array[0] * 10 + array[1] * 20 + array[2] * 50 +
        array[3] * 6;
        int sum = java.util.Arrays.stream(array).sum();
        int time = 0;
        
        if (result >= 500) {
            System.out.println("Overweight");
        } else {
            System.out.println("weight: " + result + "kg");
            if (result < 500 & result >= 201) {
                price = result * 25 - cost;
                System.out.println("price: " + price + "yen");
            } else {
                System.out.println("Error");
            }
        }

        if (sum / array.length >= 7) {
            System.out.println("pattern: 1");
            System.out.println("加熱時間は" + pattern.get("1") + "分です。");
            time = pattern.get("1")
        } else if (sum / array.length < 7 & sum / array.length >= 4) {
            System.out.println("pattern: 2");
            System.out.println("加熱時間は" + pattern.get("2") + "分です。");
            time = pattern.get("2")
        } else if (sum / array.length < 4) {
            System.out.println("pattern: 3");
            System.out.println("加熱時間は" + pattern.get("3") + "分です。");
            time = pattern.get("3")
        }

    }
}
