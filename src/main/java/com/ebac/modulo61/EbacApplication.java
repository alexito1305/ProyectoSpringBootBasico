package com.ebac.modulo61;

import com.ebac.modulo61.service.Service;
import com.ebac.modulo61.service.ServiceAnnotationClass;
import com.ebac.modulo61.service.ServiceConstructorClass;
import com.ebac.modulo61.service.ServiceSetterClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EbacApplication {

	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        AnnotationConfigApplicationContext acaContext = new AnnotationConfigApplicationContext();
        acaContext.scan("com.ebac.modulo61");
        acaContext.refresh();

        System.out.println("-----Bean por Setter-----");
        ServiceSetterClass setterBean = (ServiceSetterClass) context.getBean("serviceSetterClassBean");
        setterBean.executeTask();

        System.out.println("-----Bean por Constructor-----");
        ServiceConstructorClass constructorBean = (ServiceConstructorClass) context.getBean("serviceConstructorClassBean");
        constructorBean.executeTask();

        System.out.println("-----Bean por Anotación-----");
        ServiceAnnotationClass annotationBean = (ServiceAnnotationClass) context.getBean("serviceAnnotationClassBean");
        annotationBean.executeTask();
        System.out.println("----------------------------------------------------");

        System.out.println("-----EJERCICIO CON ANOTACIONES-----");
        Service service = acaContext.getBean(Service.class);
        System.out.println("HashCode del objeto service: " + service.hashCode());
        String userName = service.getUser("Firpo");
        System.out.println(userName);

        System.out.println("-------------------------------");
        Service service2 = acaContext.getBean(Service.class);
        System.out.println("HashCode del objeto service: " + service2.hashCode());
        String userName2 = service2.getUser(null);
        System.out.println(userName2);

        System.out.println("-----MOSTRAR FIGURAS-----");
        Service figuraService = acaContext.getBean(Service.class);
        figuraService.imprimirFigura1();
        figuraService.imprimirFigura2();
    }
}
