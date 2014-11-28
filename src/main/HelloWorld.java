package main;

import java.util.Timer;

/**
 * Created by therioyo on 28.11.14.
 */
public class HelloWorld {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello, World!");
        Calc calc = new Calc(12, 15, '*');
        System.out.println(calc.calc());

        Cat cat = new Cat("Tom");
        cat.addHistory("first visit");
        Thread.sleep(10000);
        cat.addHistory("weight=6kg");

        Cat kitten = new Cat("Bars");
        kitten.addHistory("first visit, 2 months old");
        Thread.sleep(10000);
        kitten.addHistory("weight=220g");

        cat.showHistory();
        kitten.showHistory();
    }
}
