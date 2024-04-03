package Pizzeria;
import java.util.List;

public class PizzaCombinada implements Pizza {
    private String nombre;
    private String descripcion;
    private List<Pizza> pizzas;

    public PizzaCombinada(String nombre, String descripcion, List<Pizza> pizzas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.pizzas = pizzas;
    }

    public double getPrecio() {
        double precioMaximo = 0;
        for (Pizza pizza : pizzas) {
            double precio = pizza.getPrecio();
            if (precio > precioMaximo) {
                precioMaximo = precio;
            }
        }
        return precioMaximo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
