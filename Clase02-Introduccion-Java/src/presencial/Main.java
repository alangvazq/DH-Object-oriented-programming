package presencial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inscripciones a exámenes CTD");
        System.out.println("Ingrese nombre: ");
        System.out.println();
        String nombre = scanner.nextLine();
        char letraInicial = primeraLetra(nombre);
        char letraFinal = ultimaLetra(nombre);
        System.out.println("Ingrese matrícula númerica: ");
        Integer matricula = scanner.nextInt();
        System.out.println("Ingrese edad: ");
        int edad = scanner.nextInt();
        System.out.println("Ingrese nota anterior: ");
        double nota = scanner.nextDouble();

        scanner.close();

        System.out.println("Verifique datos ingresados: ");
        System.out.println(nombre+" ,"+matricula+" ,"+edad+" ,"+nota);
        System.out.println("Letra inicial: "+letraInicial+" Letra final: "+letraFinal);
    }

    public static char primeraLetra(String nombre){
        return nombre.charAt(0);
    }

    public static char ultimaLetra(String nombre){
        return nombre.charAt(nombre.length()-1);
    }

}
