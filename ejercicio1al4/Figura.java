/*Se hará una librería de clases que represente figuras tridimensionales y bidimensionales, y su respectiva
jerarquía de clases. Las clases deben ser capaces de tener funcionamiento bastante básico, como obtener áreas,
volúmenes y perímetros de la figura correspondiente. La representación de la jerarquía sería como la
representada en el diagrama. Para este ejercicio deberá crear la clase abstracta Figura según el diagrama, 
los atributos y los métodos que ahí figuran.*/
package ejercicio1al4;
public abstract class Figura {
    //las clases abstractas son aquellas en las cuales no deseo crear intancias de las mismas 
    //La clase es muy general y no tiene sentido crear instancias 
    private String nombre;
    private int grosorBorde;
    private int color;

    public Figura() {
    }

    public Figura(String nombre, int grosorBorde, int color) {
        this.nombre = nombre;
        this.grosorBorde = grosorBorde;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGrosorBorde() {
        return grosorBorde;
    }

    public void setGrosorBorde(int grosorBorde) {
        this.grosorBorde = grosorBorde;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    
    public abstract void dibujar ();

}
