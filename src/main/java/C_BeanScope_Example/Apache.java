package C_BeanScope_Example;

public class Apache implements Bike{
    public Apache() {
        System.out.println("Apache :: CONSTRUCTOR");
    }
    @Override
    public void wash() {
        System.out.println("Apache washing....");
    }
}
