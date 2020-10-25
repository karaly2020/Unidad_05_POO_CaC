package polimorfismo;
public class Medicos extends Personal {
    private String Matricula;
    private String Especialidad;

    public Medicos(String nombre, String apellido, int edad, double sueldo) {
        super(nombre, apellido, edad, sueldo);
        this.sueldo = sueldo;
        Matricula = "35853";
        Especialidad="Clínica Médica";
    }

    @Override
    void Sueldo() { System.out.println("El sueldo de Médico es de " + this.sueldo + "-");
    }
}
    
