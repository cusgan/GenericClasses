package Arithmetic;

import java.text.DecimalFormat;

public class Arithmetic<S extends Number, T extends Number> {
    private S num1;
    private T num2;

    public Arithmetic(S num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Number add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public Number subtract() {
        return num1.doubleValue() - num2.doubleValue();
    }

    public Number multiply() {
        return num1.doubleValue() * num2.doubleValue();
    }

    public Number divide() {
        return num1.doubleValue() / num2.doubleValue();
    }

    public Number getMin() {
        if (num1.doubleValue() < num2.doubleValue())
            return num1;
        return num2;
    }

    public Number getMax() {
        if (num1.doubleValue() > num2.doubleValue())
            return num1;
        return num2;
    }

    public void printOperations() {
        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println("NUMBERS [" + num1 + "] and [" + num2 + "]");
        System.out.println(num1 + " + " + num2 + " = " + df.format(add()));
        System.out.println(num1 + " - " + num2 + " = " + df.format(subtract()));
        System.out.println(num1 + " × " + num2 + " = " + df.format(multiply()));
        System.out.println(num1 + " ÷ " + num2 + " = " + df.format(divide()));
        System.out.println("Minimum: " + getMin());
        System.out.println("Maximum: " + getMax());
        System.out.println();
    }
}
