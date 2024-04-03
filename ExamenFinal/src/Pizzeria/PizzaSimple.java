package Pizzeria;

class PizzaSimple implements Pizza {
    private String nombre;
    private String descripcion;
    private double precioBase;
    private boolean esEspecial;

    public PizzaSimple(String nombre, String descripcion, double precioBase, boolean esEspecial) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.esEspecial = esEspecial;
    }

    public double getPrecio() {
        if (esEspecial) {
            return precioBase * 1.7;
        } else {
            return precioBase;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
