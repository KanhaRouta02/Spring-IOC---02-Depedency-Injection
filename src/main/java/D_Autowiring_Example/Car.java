package D_Autowiring_Example;

// byName
/* public class Car {
   private Engine eng;
   public Car(){

   }
   public void setEngine(Engine engine) {
       this.eng = engine;
   }
   public void drive() {
       eng.start();
       System.out.println("Car Running...");
   }
}
*/

// byType
public class Car {
    private PetrolEngine eng;
    public Car(){

    }
    public void setEngine(PetrolEngine engine) {
        this.eng = engine;
    }
    public void drive() {
        eng.start();
        System.out.println("Car Running...");
    }
}