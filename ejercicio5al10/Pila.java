/* Crea una clase llamada Pila, que implemente la interfaz IColeccion del ejercicio anterior,
utilizando para ello un ArrayList de Object. Para la clase se utilizan como atributos un ArrayList
de Object. Tenga en cuenta la siguiente jerarquía al momento de implementar la interfaz y
resolver el resto de los ejercicios.*/
package ejercicio5al10;
import java.util.ArrayList;
import java.util.Iterator;
public class Pila implements IColeccion {
    //atributos:
    ArrayList <Object> micoleccion;
    private int contador=0; 
    
    //constructor: 
    public Pila(int contador){
    this.contador=contador; 
    this.micoleccion=new ArrayList(contador+1);
    }

    //metodos
    
    /*Escribir el código para el método estaVacia() que comprueba si el contador (método size del
    ArrayList) es 0 y devuelve true o false según corresponda.*/
    @Override
    public boolean estaVacia(){
        boolean respuesta;
        if (contador==0){
            respuesta=true;
        }else{
            respuesta=false;
        }return respuesta;
    }
    
    /* Escribir el código para el método extraer() que si la Pila está vacía, devuelve null, si no
    decrementa el contador y devuelve el elemento que está en la celda indicada por el contador,
    después de decrementarse.*/
    @Override
    public Object extraer(){
        if (micoleccion.isEmpty()){
            return null;
        }else{
            contador--; 
            return micoleccion.get(contador);
        }
    }
    
    /*Escribir el código para el método primero() que si la Pila está vacía, devuelve null, si no,
    devuelve el elemento que está indicado por el contador.*/
    @Override
    public Object primero(){
        if(micoleccion.isEmpty()){
            return null;
        }else{
            return micoleccion.get(0);
        }
    }

    /*Escribir el código para el método añadir()/agregar() de la clase Pila que comprueba que cabe el elemento,
    y si es así, lo añade en la celda que indica el contador, posteriormente se incrementa el valor del
    contador. Devuelve true o false, según si se ha podido añadir o no. */
    @Override
    public boolean agregar(Object elemento){
        boolean respuesta; 
        if (micoleccion.size()>=contador){
            micoleccion.add(contador, elemento); //contador es la posicion en la que se agregara el elemento.
            contador++; 
        }
        if(micoleccion.contains(elemento.toString())){
            respuesta=true;
        }else{
            respuesta=false;
        }
            return respuesta;
    }

    @Override //averiguar si está bien que recorra e imprima los elementos en este método!
    public String toString(){
        System.out.println("Los elementos de la coleccion son: ");
        Iterator<Object>it=micoleccion.iterator(); 

        while(it.hasNext()){
            Object elemento=it.next(); 
            System.out.println(elemento+ " ");
        }
        return "La coleccion está vacia??: " +estaVacia()+ " El primer elemento es: "+primero()+" "
                + "Los elementos de la coleccion son: ";
    }
}
