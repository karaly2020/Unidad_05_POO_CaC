package ejercicio1al4;
public abstract class Figura3D extends Figura{

    public Figura3D() {
    }

    public Figura3D(String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
    }
    
    public abstract double calcularVolumen ();
        
}

