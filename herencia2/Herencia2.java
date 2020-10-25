package herencia2;
public class Herencia2 {
    public static void main(String[] args) {
        //casting
        Empleado CC = (Empleado)new Comercial ("Jose", "Paz" , 150);
        Empleado RR = (Empleado)new Repositor ("Juan" , "Gomez" , "Mataderos");
        
        if (CC instanceof Comercial){       
            CC.metodoEmpleado();
            CC.metodoEmpleado2();  
            
        }
        if (RR instanceof Repositor){
            RR.metodoEmpleado();
            RR.metodoEmpleado2();
        }
    }
}
    

