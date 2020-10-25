package ejercicio5al10;
public class Productos {
    private int id;

   public Productos (int id){
       this.id=id; 
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   public String toString(){
       return "id "+this.id;
   }
}
