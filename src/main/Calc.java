package main;

/**
 * Created by therioyo on 28.11.14.
 */
public class Calc {
    private int a;
    private int b;
    private char c;

    public Calc(int a, int b, char c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int calc(){
        int result = 0;
        switch(c){
            case '+':
                result = a+b;
                break;
            case '-':
                result = a-b;
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                if(b==0)throw new ArithmeticException("devide by 0");
                result = a/b;
                break;
            default:
                throw new IllegalArgumentException("illegal symbol");
        }
        return result;
    }
}
