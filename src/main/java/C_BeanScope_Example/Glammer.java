package C_BeanScope_Example;

public class Glammer implements Bike{
    public Glammer(){
        System.out.println("Glammer :: CONSTRUCTOR");
    }
    @Override
    public void wash() {
        System.out.println("Glammer washing...");
    }
}
