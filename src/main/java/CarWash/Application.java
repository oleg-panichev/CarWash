package CarWash;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Oleg on 15.03.14.
 */
public class Application {
    private String appName="default app name";

    public Application(String appName) {
        System.out.println("Constructor: "+appName);
        this.appName = appName;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
        System.out.println("Setter: "+appName);
    }

    public void init() {
        System.out.println("Init: "+appName+" initialized");
    }

    public void destroy() {
        System.out.println("Destroy: "+appName+" destroyed");
    }

    public static void main(String[] args) {
        AbstractApplicationContext context=new FileSystemXmlApplicationContext("src\\main\\java\\constuctorbased-spring-config.xml");
        Application app=context.getBean(Application.class);
        System.out.println("Main: "+app.getAppName());
        context.registerShutdownHook();
    }
}
