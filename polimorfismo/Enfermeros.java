package polimorfismo;
final class Enfermeros extends Personal{
    private String Matricula;

    public Enfermeros(String nombre, String apellido, int edad, double sueldo) {
        super(nombre, apellido, edad, sueldo);
        this.sueldo = sueldo;
        Matricula = "25836";
    }

    @Override
    void Sueldo() { System.out.println("El sueldo de Enfermero es de " + sueldo + "-"); 
    }
}
