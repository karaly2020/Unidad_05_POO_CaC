/* Escribe una interfaz, llamada IColeccion, que declare los siguientes métodos:
• estaVacia(): devuelve true si la colección está vacía y false en caso contrario.
• extraer(): devuelve y elimina el primer elemento de la colección.
• primero(): devuelve el primer elemento de la colección.
• añadir(): añade un objeto, y devuelve true si se ha añadido y false en caso contrario.
Nota: en la interfaz se declaran todos los métodos sin implementar ninguno.*/
package ejercicio5al10;
public interface IColeccion {
    
    //estaVacia(): devuelve true si la colección está vacía y false en caso contrario. 
    public boolean estaVacia();
    
    //extraer(): devuelve y elimina el primer elemento de la colección. 
    public Object extraer();

    //primero(): devuelve el primer elemento de la colección. 
    public Object primero();

    //añadir(): añade un objeto, y devuelve true si se ha añadido y false en caso contrario. 
    public boolean agregar( Object elemento);
}
