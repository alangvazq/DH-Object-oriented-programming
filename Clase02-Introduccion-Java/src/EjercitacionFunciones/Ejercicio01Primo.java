package EjercitacionFunciones;

import java.util.Scanner;

public class Ejercicio01Primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número para saber si es primo o no: ");
        int numero = scanner.nextInt();

        System.out.println(primo(numero));
    }
    public static boolean esDivisible(int n, int
            divisor){
        return n % divisor == 0;
    }

    public static String primo(int numero){
        boolean primo = true;
        for(int i = 2; i < numero; i++){
            if (esDivisible(numero, i)) {
                primo = false;
                break;
            }
        }
        if(primo){
            return "Es primo.";
        }else {
            return "No es primo.";
        }
    }
}
