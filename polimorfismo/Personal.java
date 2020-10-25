package polimorfismo;
public abstract class Personal {
    public String nombre;
    public String apellido;
    public int edad;
    public double sueldo;

    public Personal(String nombre,String apellido, int edad,double sueldo ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sueldo = sueldo;
    }
    abstract void Sueldo();
}
