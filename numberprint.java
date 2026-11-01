package Recursion;

public class numberprint {
    static void number(int n){
        System.out.println(n);
        number1(2);
    }
    static void number1(int n){
        System.out.println(n);
        number2(3);
    }

    static void number2(int n){
        System.out.println(n);
        number3(4);
    }
    static void number3(int n){
        System.out.println(n);
        number4(5);
    }
    static void number4(int n) {
        System.out.println(n);
    }
    public static void main(){
        number(1);
    }
}
