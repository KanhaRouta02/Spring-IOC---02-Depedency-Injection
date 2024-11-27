package E_Annotation_Example.in.kanha.component;

import org.springframework.stereotype.Component;

@Component
public class Chips {
    public Chips(){
        System.out.println("Chip :: constructor");
    }
    public String chipType(){
        return "32-bit Chip";
    }
}
