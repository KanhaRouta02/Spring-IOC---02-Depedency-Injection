package F_AutowiringWithAnnotation_Example.in.kanha.reposatory;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.sql.Driver;
//@Repository("connectionO")
@Repository("Oracle")
@Primary
public class OracleDriver implements MyDriverConnection {

    @Override
    public void makeConnection() {
        System.out.println("Oracle Driver making connection");
    }
}
