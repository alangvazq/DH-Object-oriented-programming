package consultorio;

public class PacienteObraSocial extends Paciente{
    private String nombreObraSocial;
    private int numeroAsociado;

    public PacienteObraSocial(Consulta consulta, String fechaNacimiento, String nombre, String apellido, boolean requierePrimeraConsulta, String nombreObraSocial, int numeroAsociados) {
        super(consulta, fechaNacimiento, nombre, apellido, requierePrimeraConsulta);
        this.nombreObraSocial = nombreObraSocial;
        this.numeroAsociado = numeroAsociados;
    }

    public boolean esMayor(PacienteObraSocial otroPacienteObraSocial){
        return this.numeroAsociado > otroPacienteObraSocial.numeroAsociado;
    }
}
