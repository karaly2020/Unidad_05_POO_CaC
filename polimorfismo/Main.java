package polimorfismo;
public class Main {
    public static void main(String[] args) {
        // Hago la instancia del objeto Medicos y Enfermeros
        Personal Med = new Medicos("Juan","Perez",33,15000);
        Personal Enf = new Enfermeros("Roberto","Gomez",25,11000);
        // Ejecuto los métodos para obtener el sueldo de cada uno
        Med.Sueldo();
        Enf.Sueldo();
    }
    
}
