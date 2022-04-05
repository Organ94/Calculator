import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = Calculator.instance.get();
        System.out.print("Введите \"х\" и \"у\" через запятую:\n>>");
        String inputStr = scan.nextLine();
        String[] input =inputStr.replaceAll("\\s", "").split(",");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);

        int plus = calc.plus.apply(x, y);
        calc.println.accept("plus:\n" + x + " + " + y + " = " + plus);

        int minus = calc.minus.apply(x, y);
        calc.println.accept("minus:\n" + x + " - " + y + " = " + minus);

        int multiply = calc.multiply.apply(x, y);
        calc.println.accept("multiply:\n" + x + " * " + y + " = " + multiply);

        try {
            int devide = calc.devide.apply(x, y);
            calc.println.accept("devide:\n" + x + " / " + y + " = " + devide);
        } catch (ArithmeticException e) {
            System.out.println("devide:\nНельзя делить на 0!");
        }

        int pow = calc.pow.apply(plus);
        calc.println.accept("pow:\n" + plus + " ^ 2 = " + pow);

        int abs = calc.abs.apply(minus);
        calc.println.accept("abs:\n" + minus + " -> " + abs);

        boolean isPositive = calc.isPositive.test(minus);
        calc.println.accept("isPositive:\n" + minus + " -> " + isPositive);

    }
}
