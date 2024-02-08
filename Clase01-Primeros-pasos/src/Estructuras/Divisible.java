package Estructuras;

public class Divisible {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;

        if (a % b == 0){
            System.out.println(a+"/"+b+" = "+(a/b));
            System.out.println(a+" es divisible entre "+b);
        }else{
            System.out.println(a+"/"+b+" = "+((double)a/b));
            System.out.println(a+" no es divisible entre "+b);
        }
    }
}
