package consultorio;

public class PacienteParticular extends Paciente{
    private double costoConsulta;
    private String dni;

    public PacienteParticular(Consulta consulta, String fechaNacimiento, String nombre, String apellido, boolean requierePrimeraConsulta, double costoConsulta, String dni) {
        super(consulta, fechaNacimiento, nombre, apellido, requierePrimeraConsulta);
        this.costoConsulta = costoConsulta;
        this.dni = dni;
    }
}
