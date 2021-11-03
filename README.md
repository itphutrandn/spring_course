# ********** ☕ Spring Day 1 ********** 
We will together study how to create project spring MVC then run HelloWorld.

## Installation
- Clone project springd1.
- Open eclipse and create server tomcat
- Import project to Eclipse EE
- Clean install project with maven 
- Run on server project 
- Enther the link on the brower : http://localhost:8080/springd1/rest/list

## ⭐️ What is the spring?
Spring is a powerful open-source, loosely coupled, lightweight, java framework meant for reducing the complexity of developing enterprise-level applications. This framework is also called the “framework of frameworks” as spring provides support to various other important frameworks like JSF, Hibernate, Structs, EJB, etc.
There are around 20 modules which are generalized into the following types:
- Core Container
- Data Access/Integration
- Web
- AOP (Aspect Oriented Programming)
- Instrumentation
- Messaging
- Test
<div align="center">
    <img src="https://s3.ap-south-1.amazonaws.com/myinterviewtrainer-domestic/public_assets/assets/000/000/839/original/spring_framework.png?1628693487" width="700px"</img> 
</div>
## ⭐️ What is DispatcherServlet in Spring MVC? In other words, can you explain the Spring MVC architecture?
<div align="center">
    <img src="https://s3.ap-south-1.amazonaws.com/myinterviewtrainer-domestic/public_assets/assets/000/000/844/original/DispatcherServlet_in_Spring_MVC.png" width="700px"</img> 
</div>
Spring MVC framework is built around a central servlet called DispatcherServlet that handles all the HTTP requests and responses. The DispatcherServlet does a lot more than that:

- It seamlessly integrates with the IoC container and allows you to use each feature of Spring in an easier manner.
- The DispatcherServlet contacts HandlerMapping to call the appropriate Controller for processing the request on receiving it. Then, the controller calls appropriate service methods to set or process the Model data. The service processes the data and returns the view name to DispatcherServlet. DispatcherServlet then takes the help of ViewResolver and picks up the defined view for the request. Once the view is decided, the DispatcherServlet passes the Model data to View where it is finally rendered on the browser.

## ⭐️ What do you mean by IoC (Inversion of Control) Container?
Spring container forms the core of the Spring Framework. The Spring container uses Dependency Injection (DI) for managing the application components by creating objects, wiring them together along with configuring and managing their overall life cycles. The instructions for the spring container to do the tasks can be provided either by XML configuration, Java annotations, or Java code.
<div align="center">
    <img src="https://s3.ap-south-1.amazonaws.com/myinterviewtrainer-domestic/public_assets/assets/000/000/840/original/IOC.png" width="700px"</img> 
</div>

## ⭐️ What do you understand by Dependency Injection?
The main idea in Dependency Injection is that you don’t have to create your objects but you just have to describe how they should be created.

- The components and services need not be connected by us in the code directly. We have to describe which services are needed by which components in the configuration file. The IoC container present in Spring will wire them up together.
<div align="center">
    <img src="https://s3.ap-south-1.amazonaws.com/myinterviewtrainer-domestic/public_assets/assets/000/000/841/original/Dependency_Injection.png" width="700px"</img> 
</div>
- In Java, the 2 major ways of achieving dependency injection are:
    - Constructor injection: Here, the IoC container invokes the class constructor with a number of arguments where each argument represents a dependency on the other class.
    - Setter injection: Here, the spring container calls the setter methods on the beans after invoking a no-argument static factory method or default constructor to instantiate the bean.
