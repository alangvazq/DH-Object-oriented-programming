package examen01;

public class Velero extends Embarcacion{

    private Integer cantidadDeMastil;

    public Velero(Double precioBase, Double valorAdicional, Double eslora, Integer cantidadDeMastil) {
        super(precioBase, valorAdicional, eslora);
        this.cantidadDeMastil = cantidadDeMastil;
    }

    @Override
    Double calcularMontoAlquiler() {
        return null;
    }

    public Boolean esGrande(Integer cantidadDeMastil){
        return cantidadDeMastil > 4;
    }
}
