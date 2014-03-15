package CarWash;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Oleg on 15.03.14.
 */
public class CarWash {
    private Set<Washable> cars;
    private Map<String,Car> carsMap;

    public void setCars(Set<Washable> cars) {
        this.cars = cars;
    }

    public void setCarsMap(Map<String, Car> carsMap) {
        this.carsMap = carsMap;
    }

    public void washAll() {
        for(Washable w:cars)
            w.wash();
    }

    public void washAllInMap() {
        for (Map.Entry<String,Car> e:carsMap.entrySet()) {
            e.getValue().wash();
        }
    }
}
