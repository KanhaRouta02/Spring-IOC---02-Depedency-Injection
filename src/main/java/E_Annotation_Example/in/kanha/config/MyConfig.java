package E_Annotation_Example.in.kanha.config;

import E_Annotation_Example.in.kanha.component.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "E_Annotation_Example.in.kanha")
public class MyConfig {

    public MyConfig() {
        System.out.println("MyConfig :: Constructor");
    }

    @Bean
    public Engine getEngine(){
        Engine engine = new Engine();
        return engine;
    }
}
