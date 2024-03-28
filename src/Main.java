import Arithmetic.Arithmetic;
import MyMap.MyMap;

public class Main {
    public static void main(String[] args) {
        // ===== CHECKING CLASS Arithmetic =====
        System.out.println("=== Class Arithmetic ===");

        int num1 = 10;
        double num2 = 3.0;
        Arithmetic<Integer, Double> am = new Arithmetic<>(num1, num2);
        am.printOperations();

        num1 = 50;
        num2 = 0.5;
        am = new Arithmetic<>(num1, num2);
        am.printOperations();

        //=== OUTPUT ===
        //NUMBERS [10] and [3.0]
        //10 + 3.0 = 13
        //10 - 3.0 = 7
        //10 × 3.0 = 30
        //10 ÷ 3.0 = 3.33
        //Minimum: 3.0
        //Maximum: 10
        //NUMBERS [50] and [0.5]
        //50 + 0.5 = 50.5
        //50 - 0.5 = 49.5
        //50 × 0.5 = 25
        //50 ÷ 0.5 = 100
        //Minimum: 0.5
        //Maximum: 50

        // ===== CHECKING CLASS MyMap =====
        System.out.println("=== Class MyMap ===");

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