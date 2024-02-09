package EjercitacionSintaxis;

public class Ejercicio01Datos {
    public static void main(String[] args) {
        String nombre = "Alan";
        String apellido = "García";
        char inicialNombre =  nombre.charAt(0);
        char inicialApellido =  apellido.charAt(0);
        int dia = 10;
        int mes = 11;
        int anio = 2010;

        System.out.println("Nombre completo: "+nombre+" "+apellido);
        System.out.println("Inicial de nombre: "+inicialNombre);
        System.out.println("Inicial de apellido: "+inicialApellido);
        System.out.println("Nacimiento: "+nacimiento(dia,mes, anio));

    }

    public static String nacimiento(int dia, int mes, int anio){
        return dia+"/"+mes+"/"+anio;
    }
}
