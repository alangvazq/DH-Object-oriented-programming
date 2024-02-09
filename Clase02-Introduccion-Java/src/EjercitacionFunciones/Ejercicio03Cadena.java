package EjercitacionFunciones;

import java.util.Scanner;

public class Ejercicio03Cadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A partir de dos cadenas de texto:
                Devolver true en caso de que sean distintos.
                Devolver false, en caso de que coincidan.
                """);
        System.out.println("Ingresa primer cadena: ");
        String cadenaA = scanner.nextLine();

        System.out.println("Ingresa segunda cadena: ");
        String cadenaB = scanner.nextLine();

        System.out.println(cadenasDeTextoDistintas(cadenaA, cadenaB));
    }
    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB){
        boolean igual = true;
        if (unTextoA.equals(unTextoB)){
            igual = false;
        }
        return igual;
    }
}
