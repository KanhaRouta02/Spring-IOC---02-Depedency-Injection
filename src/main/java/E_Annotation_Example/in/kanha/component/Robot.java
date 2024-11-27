package E_Annotation_Example.in.kanha.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {

   @Autowired
   private Chips chips;

   public Robot() {
       System.out.println("Robot constructor");
   }
   public void start(){
       String s = chips.chipType();
       if(s.equals("32-bit Chip")){
           System.out.println("Robot start....");
       }
   }
}
