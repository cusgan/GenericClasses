package Arithmetic;

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
}
