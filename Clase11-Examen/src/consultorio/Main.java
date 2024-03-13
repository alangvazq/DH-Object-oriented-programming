package consultorio;

public class Main {
    public static void main(String[] args) {
        PacienteParticular pacienteParticular = new PacienteParticular(new Consulta("12-03-2024","odontologia",2,20),"10-04-1990","Tito","Capotito",true,1500,"123abc");
        PacienteObraSocial pacienteObraSocial = new PacienteObraSocial(new Consulta("15-04-2024","cardiologia",4,30),"12-06-1992","Paco","Tato",false,"IMSS",300);
    }
}
