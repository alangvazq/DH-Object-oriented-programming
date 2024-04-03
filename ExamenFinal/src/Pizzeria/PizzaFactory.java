package Pizzeria;
import java.util.List;

class PizzaFactory {
    public static Pizza construirPizzaSimple(String nombre, String descripcion, double precioBase, boolean esEspecial) {
        return new PizzaSimple(nombre, descripcion, precioBase, esEspecial);
    }
    public static Pizza construirPizzaCombinada(String nombre, String descripcion, List<Pizza> pizzas) {
        return new PizzaCombinada(nombre, descripcion, pizzas);
    }
}
