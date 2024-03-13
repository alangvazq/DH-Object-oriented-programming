package consultorio;

public class Paciente {
    private Consulta consulta;
    private String fechaNacimiento;
    private String nombre;
    private String apellido;
    private boolean requierePrimeraConsulta;

    public Paciente(Consulta consulta, String fechaNacimiento, String nombre, String apellido, boolean requierePrimeraConsulta) {
        this.consulta = consulta;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.requierePrimeraConsulta = requierePrimeraConsulta;
    }

    public boolean evaluacionInicial(){
        return requierePrimeraConsulta;
    }
}
