import Arithmetic.Arithmetic;
import MyMap.MyMap;

public class Main {
    public static void main(String[] args) {
        // ===== CHECKING CLASS Arithmetic =====
        System.out.println("=== Class Arithmetic ===");

        int num1 = 50;
        double num2 = 0.5;
        Arithmetic<Integer, Double> am = new Arithmetic<>(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + am.add());
        System.out.println(num1 + " - " + num2 + " = " + am.subtract());
        System.out.println(num1 + " × " + num2 + " = " + am.multiply());
        System.out.println(num1 + " ÷ " + num2 + " = " + am.divide());
        System.out.println("Minimum: " + am.getMin());
        System.out.println("Maximum: " + am.getMax());

        //=== OUTPUT ===
        //50 + 0.5 = 50.5
        //50 - 0.5 = 49.5
        //50 × 0.5 = 25.0
        //50 ÷ 0.5 = 100.0
        //Minimum: 0.5
        //Maximum: 50

        // ===== CHECKING CLASS MyMap =====
        System.out.println("\n=== Class MyMap ===");

        String str1 = "hello", str2 = "world";
        int n1 = 3, n2 = 7;

        MyMap<String, Integer> map = new MyMap<String, Integer>();
        map.put(str1, n1);
        map.put(str2, n2);

        System.out.println(str1 + ": " + map.get(str1));
        System.out.println(str2 + ": " + map.get(str2));

        System.out.println("Removed: " + map.remove(str1));

        System.out.println(str1 + ": " + map.get(str1));
        System.out.println(str2 + ": " + map.get(str2));

        //=== OUTPUT ===
        //hello: 3
        //world: 7
        //Removed: 3
        //hello: null
        //world: 7
    }
}