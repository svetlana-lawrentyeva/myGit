package main;

/**
 * Created by therioyo on 28.11.14.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Calc calc = new Calc(12, 15, '*');
        System.out.println(calc.calc());
    }
}
