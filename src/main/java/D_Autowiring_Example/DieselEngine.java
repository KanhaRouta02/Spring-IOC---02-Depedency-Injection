package D_Autowiring_Example;

public class DieselEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Diesel Engine Started...");
    }
}
