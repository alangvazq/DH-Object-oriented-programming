package consultorio;

public class Consulta {
    private String fechaConsulta;
    private String especialidad;
    private int hora;
    private int minuto;

    public Consulta(String fechaConsulta, String especialidad, int hora, int minuto) {
        this.fechaConsulta = fechaConsulta;
        this.especialidad = especialidad;
        this.hora = hora;
        this.minuto = minuto;
    }
}
