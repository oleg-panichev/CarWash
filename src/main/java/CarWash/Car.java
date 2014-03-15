package CarWash;

/**
 * Created by Oleg on 15.03.14.
 */
public class Car implements Washable {
    String name;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void wash() {
        System.out.println(name+" washed.");
    }
}
