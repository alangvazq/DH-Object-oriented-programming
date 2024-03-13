package examen01;

public class Yate extends Embarcacion{
    private Integer cantidadCamarotes;
    public Yate(Double precioBase, Double valorAdicional, Double eslora, Integer cantidadCamarotes) {
        super(precioBase, valorAdicional, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public Integer getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    @Override
    Double calcularMontoAlquiler() {
        return null;
    }

//    public Boolean esLujoso(Object Yate){
//        return cantidadCamarotes > Yate.cantidadCamarotes;
//    }
}
