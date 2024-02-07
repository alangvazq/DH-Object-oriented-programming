package Ejercicio01;

import org.w3c.dom.ls.LSOutput;

public class Caballo {

    public static void main(String[] args) {
        String color = "Blanco";
        String nombre = "Braulio";
        Double comida = 1250.40;
        String raza = "Criollos";
        String personalidad = "noble";

        System.out.println("El granjero tiene un caballo "+color+" llamado "+nombre+" que come "+comida+" pesos semanales.");
        System.out.println(nombre+" es de raza "+raza+" y es muy "+personalidad+".");
    }
}
