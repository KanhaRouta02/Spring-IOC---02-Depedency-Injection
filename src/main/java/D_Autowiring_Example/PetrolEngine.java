package D_Autowiring_Example;

public class PetrolEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Petrol Engine Started....");
    }
}
