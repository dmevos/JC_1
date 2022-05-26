import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = Integer::sum;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<String> divide = (x, y) -> Integer.parseInt(y) != 0 ? Integer.toString(Integer.parseInt(x) / Integer.parseInt(y)) : "На ноль делить низя";
    //Блин... Хоть и работает, но попой чувствую, что не так. Но тогда как?

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Object> println = System.out::println;
    //Чтобы вывести true или false - поменяем дженерик-тип на Object.
    //Возможно это не самый рациональный способ, но до другого что-то пока не доходит...

}
