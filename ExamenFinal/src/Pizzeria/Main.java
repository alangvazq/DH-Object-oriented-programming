package Pizzeria;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pizza pizzaMuzzarella = PizzaFactory.construirPizzaSimple("Muzzarella", "Pizza de muzzarella", 700, false);
        Pizza pizzaMargarita = PizzaFactory.construirPizzaSimple("Margarita", "Pizza margarita especial", 850, true);
        Pizza pizzaAnana = PizzaFactory.construirPizzaSimple("Ananá", "Pizza de ananá", 950, false);

        List<Pizza> pizzasCombinadas = new ArrayList<>();
        pizzasCombinadas.add(pizzaMargarita);
        pizzasCombinadas.add(pizzaAnana);
        Pizza pizzaCombinadaLoca = PizzaFactory.construirPizzaCombinada("Combinada Loca", "Pizza combinada", pizzasCombinadas);

        mostrarPizza(pizzaMuzzarella);
        mostrarPizza(pizzaMargarita);
        mostrarPizza(pizzaAnana);
        mostrarPizza(pizzaCombinadaLoca);
    }

    public static void mostrarPizza(Pizza pizza) {
        System.out.println("Pizza " + pizza.getNombre() + ", Precio: $" + pizza.getPrecio());
    }
}
