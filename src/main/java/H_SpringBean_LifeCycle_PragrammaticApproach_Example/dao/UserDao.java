package H_SpringBean_LifeCycle_PragrammaticApproach_Example.dao;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserDao implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init Method...");
    }
    public void getData(){
        System.out.println("Getting data form DB > ");
    }
    @Override
    public void destroy() throws Exception {
       System.out.println("Destroy Method...");
    }


}
