package ejemplos;

public class Ejemplo {
    public static void main(String[] args) {
        int valor01 = 10;
        int valor02 = 20;

        boolean resultado = esDivisible(valor01, valor02);
        System.out.println(resultado);
    }

    public static boolean esDivisible(int n, int divisor) {
        return n % divisor == 0;
    }
}


