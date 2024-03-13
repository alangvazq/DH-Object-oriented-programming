package examen01;

import java.util.Date;

public abstract class Embarcacion {
    protected Double precioBase;
    protected Double valorAdicional;
    protected Double eslora;

    public Embarcacion(Double precioBase, Double valorAdicional, Double eslora) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.eslora = eslora;
    }

    abstract Double calcularMontoAlquiler();
}
