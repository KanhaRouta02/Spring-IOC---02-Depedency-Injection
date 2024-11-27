package F_AutowiringWithAnnotation_Example.in.kanha.reposatory;

import org.springframework.stereotype.Repository;

import java.sql.Driver;

@Repository("SQL")
public class SqlDriver implements MyDriverConnection {
    @Override
    public void makeConnection() {
        System.out.println("SQL Driver making connection");
    }
}
