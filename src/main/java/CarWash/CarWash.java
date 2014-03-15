package CarWash;

import java.util.List;

/**
 * Created by Oleg on 15.03.14.
 */
public class CarWash {
    private List<Washable> cars;

    public void setCars(List<Washable> cars) {
        this.cars = cars;
    }

    public void washAll() {
        for(Washable w:cars)
            w.wash();
    }
}
