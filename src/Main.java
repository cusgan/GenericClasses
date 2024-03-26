import Arithmetic.Arithmetic;
import MyMap.MyMap;

public class Main {
    public static void main(String[] args) {
        // ===== CHECKING CLASS Arithmetic =====
        System.out.println("\n=== Class Arithmetic ===");

        Arithmetic<Integer, Double> ari = new Arithmetic<>(15,3.5);
        System.out.println(ari.add());


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