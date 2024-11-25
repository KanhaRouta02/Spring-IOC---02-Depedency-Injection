What is Dependency Injection?
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
Note: Setter Injection will override Constructor injection.


