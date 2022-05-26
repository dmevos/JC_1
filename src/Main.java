import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        String c = calc.divide.apply(Integer.toString(a), Integer.toString(b));
        int d = calc.multiply.apply(2,4);
        int e = calc.pow.apply(3);
        int f = calc.abs.apply(-8);
        boolean g = calc.isPositive.test(-8);

        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);
        calc.println.accept(d);
        calc.println.accept(e);
        calc.println.accept(f);
        calc.println.accept(g);
    }
}
