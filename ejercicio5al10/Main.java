package ejercicio5al10;
public class Main {
    public static void main(String[] args) {
        Pila pila0=new Pila(0); 

        Productos prod1=new Productos(1); 

        Productos prod2=new Productos(2); 

        pila0.agregar(prod1);

        pila0.agregar(prod2);

        System.out.println(pila0.estaVacia()); 

        System.out.println(" se extrajo : "+pila0.extraer()); 

        pila0.toString();
    }
}
