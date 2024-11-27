package H_SpringBean_LifeCycle_PragrammaticApproach_Example.test;


import H_SpringBean_LifeCycle_PragrammaticApproach_Example.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("BeanLifeCycleProgrammaticApproach.xml");
        UserDao bean = context.getBean(UserDao.class);
        bean.getData();
        ConfigurableApplicationContext configurableApplicationContext =
                (ConfigurableApplicationContext) context;
        configurableApplicationContext.close();
    }
}
