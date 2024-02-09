package EjercitacionFunciones;

import java.util.Scanner;

public class Ejercicio02Mayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("El programa permite saber el mayor de 3 números ingresados.");
        System.out.println("Ingresa primer número: ");
        int numero01 = scanner.nextInt();
        System.out.println("Ingresa segundo número: ");
        int numero02 = scanner.nextInt();
        System.out.println("Ingresa tercer número: ");
        int numero03 = scanner.nextInt();

        int mayor = maximoEntreTresNumeros(numero01, numero02, numero03);
        System.out.println("El número mayor es: "+mayor);
    }
    public static Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer
            unNumeroC){
        if (unNumeroA > unNumeroC){
            unNumeroC = unNumeroA;
        }

        if (unNumeroB > unNumeroC){
            unNumeroC = unNumeroB;
        }
        return unNumeroC;
    }
}
