package CarWash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new FileSystemXmlApplicationContext("src\\main\\java\\spring-config.xml");
        CarWash carWash=context.getBean(CarWash.class);
        carWash.washAll();
        System.out.println("Wash in map:");
        carWash.washAllInMap();
        System.out.println(context.getBean("newCar"));
    }
}
