package Arithmetic;

public class Arithmetic<S extends Number, T extends Number> {
    private S num1;
    private T num2;

    public Arithmetic(S num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Number add() {
        return Double.parseDouble(num1.toString()) + Double.parseDouble(num2.toString());
    }

    public Number subtract() {
        return Double.parseDouble(num1.toString()) - Double.parseDouble(num2.toString());
    }

    public Number multiply() {
        return Double.parseDouble(num1.toString()) * Double.parseDouble(num2.toString());
    }

    public Number divide() {
        return Double.parseDouble(num1.toString()) / Double.parseDouble(num2.toString());
    }

    public Number getMin() {
        if (Double.parseDouble(num1.toString()) < Double.parseDouble(num2.toString()))
            return num1;
        return num2;
    }

    public Number getMax() {
        if (Double.parseDouble(num1.toString()) > Double.parseDouble(num2.toString()))
            return num1;
        return num2;
    }
}
