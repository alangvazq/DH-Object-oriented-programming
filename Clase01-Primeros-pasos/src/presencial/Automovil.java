package presencial;

public class Automovil {
    public static void main(String[] args) {
        String marca = "Ford";
        char inicial = marca.charAt(0); // Seria el metodo que nos devuelve la letra
        int cantidadDePuertas = 4; //variable primitiva
        Integer anioDeFabricacion = 2024; // Clase envolvente
        double capacidad = 400.4;
        Double capacidadCombustible = 40.5; //ctrl + click izq

        System.out.println("Bienvenidos"); // Sout
        System.out.println("Auto seleccionado: "+marca+" Inicial de la Marca: "+inicial);
        System.out.println("Cpacidad de combustible: "+capacidadCombustible);
    }


}
