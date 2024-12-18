A) What is Dependency Injection?
   =============================
The process of injecting dependent object into target object using target class variable  / setter method / constructor is called as Dependency Injection.
Dependency Injection Types

1) Field Injection (variable)
2) Setter Injection (setter method)
3) Constructor Injection (constructor)
   
Requirement:

Develop an application to perform bill payment. It should support for multiple Payment options (Debit card, Credit Card, Sodex & Amex.... )


![image](https://github.com/user-attachments/assets/a65b515f-b6a2-4d0f-8022-a1b5aca9652d)

What will happen when we perform both constructor & setter injections on same variable ?
========================================================================================

-> First Constructor injection will happen then it will initialize the variable then setter injection will happen and it will re-initialize the same variable so final value be setter injection value.

Note ✅ : Setter Injection will override Constructor injection.

B) What is IoC ?
   =============

IOC: Inversion of Control

-> IOC is a principle which is used to manage and collaborate dependencies among the objects in the application.

-> In Spring, IOC is responsible for Dependency Injection.

![image](https://github.com/user-attachments/assets/2813047b-de96-4783-b61b-e73ebc4bfa48)

Note ✅ : For IOC we need to pass Java Classes + Configuration as input then IOC will perform DI and it will produce Spring Beans.

Spring Bean : The class which is managed by IOC is called as Spring Bean.

How start IOC container?
========================
=> We can start in 2 ways 

1) BeanFactory (I) (outdated)

2) ApplicationContext (I) (recommended)

ApplicationContext ctxt = new ClassPathXmlApplicationContext(String xmlFile)

Creating First Spring Project
============================

1) Open any IDE

2) Create Maven Project

3) Open pom.xml file and add below dependency 👇

              <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-context</artifactId>
                <version>6.1.6</version>
             </dependency>


 Note ✅ : After adding dependency verify project Maven Dependencies folder (jars should be displayed)
 
 4) Create Required Java classes.

 5) Create Bean Configuration File like below 👇 

          <?xml version="1.0" encoding="UTF-8"?>
          <beans xmlns="http://www.springframework.org/schema/beans"
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="
           http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

          <!-- bean definitions here -->
          <bean id="credit" class="B_Payment_App_With_IoC_XML.CreditCard"/>
          <bean id="debit" class="B_Payment_App_With_IoC_XML.DebitCard"/>
          <bean id="sodexo" class="B_Payment_App_With_IoC_XML.SodexoCard"/>
          <bean id="payment" class="B_Payment_App_With_IoC_XML.PaymentService">
    
          <!--Constructor Injection-->
          <constructor-arg name="payment" ref="credit" />
    
          <!--Setter Injection-->
         <property name="payment" ref="debit"/>
        </bean>
        </beans>

 6) Create Test Class and start IOC Container.

        public class TestPaymentProcess {
        public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Bean.xml");
        PaymentService paymentService = context.getBean(PaymentService.class);
        paymentService.pay(15000.00);
         }
        }

@ Constructor Injection will be represented like below 👇

      <constructor-arg name="payment" ref="credit" />
      
@ Setter Injection will be represented like below 👇

      <property name="payment" ref="debit" />

Note ✅ : "ref" attribute represents which object should be injected.

C) Spring Bean Scopes
   ==================
   
-> Bean Scope will decide how many objs should be created for Spring Bean class.

-> We have 4 types of scopes

			1) singleton  (default)
   
			2) prototype
   
			3) request
   
			4) session
   
-> Singleton means only one object will be created.

-> Prototype means every time new object will be created.

Note ✅ : request & session scopes we will use in spring web mvc.

       </beans>
          <bean id="apache" class="C_BeanScope_Example.Apache" />
          <bean id="glammer" class="C_BeanScope_Example.Glammer" />
          <bean id="washpoint" class="C_BeanScope_Example.WashPoint" scope="prototype">
          <constructor-arg ref="apache"/>
      </bean>
      
D) Autowiring
   ==========
   
=> Auto wiring is used to identify dependent objects and inject into target objects.

=> Autowiring works based on below modes

			1) byName
   
			2) byType
   
			3) constructor
   
			4) none
   
-> byName MODE will identify dependent bean based on variable name matching with bean id.

-> byType MODE will identify dependent bean  based on variable data type.

Note ✅ : There is a chance of getting ambiguity in byType mode.

=> If variable data type is interface then we can have multiple implementation classes in this scenario IOC can't decide which bean it has to inject.

=> We can resolve byType ambiguity in 2 ways

		1) auto-wire-candiate="false" 
		2) primary = "true"
  
E) Spring Annotations
   ==================
@Configuration : To represent java class as config class

@Component : To represent java class as Spring Bean class

@Service : To represent java class as Spring Bean class

@Repository : To represent java class as Spring Bean class

@Scope : To represent scope of spring bean (default : singleton)

@Autowired : Inject dependent into target

@Bean : To customize bean object creation

@Qualifier : To identify bean based on the given name for DI

@Primary : To give priority for the bean for auto wiring

What is Component Scanning ?

=> It is used to identify Spring Bean classes available in the Project.

=> It will start scanning from current pacakge.

F) Autowiring with Annotation
   ==========================
   
=> To perform autowiring we will use @Autowired annotation.

=> @Autowired annotation we can use at 3 places

				1) variable level --- FI 
				2) constructor level -- CI
				3) setter method level – SI

G) Spring Bean Life Cycle
   ======================
   
=> The class which is managed by IOC is called as Spring Bean.

=> We can perform some operations when bean object created and before bean object is removed.	

				- post construct
				- pre destory
=> To achieve above requirement we can use bean life cycle methods.

=> Bean Life cycle methods we can execute in 3 ways
	
	1) Declarative approach (xml)
	2) Programmatic approach
	3) Annotation approach



     

  
   






