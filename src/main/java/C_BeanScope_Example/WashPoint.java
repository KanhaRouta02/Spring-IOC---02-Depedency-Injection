package C_BeanScope_Example;

public class WashPoint {
   public Bike bike;
   public WashPoint(Bike bike) {
       this.bike = bike;
   }
   public void bikeWash() {
       bike.wash();
       System.out.println(bike.getClass().getName() + "bikeWash");
   }
}
