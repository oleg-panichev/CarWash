package CarWash;

/**
 * Created by Oleg on 15.03.14.
 */
public class Car implements Washable {
    String name;
    Person owner;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public void wash() {
        System.out.println(name+" washed.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", owner=" + owner +
                '}';
    }
}
