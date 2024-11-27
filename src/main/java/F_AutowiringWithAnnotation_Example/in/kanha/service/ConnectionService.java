package F_AutowiringWithAnnotation_Example.in.kanha.service;


import F_AutowiringWithAnnotation_Example.in.kanha.reposatory.MyDriverConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ConnectionService {
    // Filed Injection
//    @Autowired
//    @Qualifier("SQL")
     private MyDriverConnection connection;
     // Constructor Injection
     @Autowired
     public ConnectionService(MyDriverConnection connection) {
         System.out.println("Constructor Injection");
         this.connection = connection;
     }
    // Setter Injection
    @Autowired
    public void setConnection(MyDriverConnection connection) {
        System.out.println("Setter Injection....");
        this.connection = connection;
    }

    public void createConnection() {
        connection.makeConnection();
        System.out.println("Connection created");
    }
}
