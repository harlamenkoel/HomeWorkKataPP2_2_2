package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    @Override
    public List<Car> getCarCount(Integer count) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Mark", 2000));
        cars.add(new Car("BMW", "X5", 2005));
        cars.add(new Car("Mazda", "CX-5", 2010));
        cars.add(new Car("Ford", "Mustang", 2015));
        cars.add(new Car("Dodge", "Charger", 2008));
        cars.add(new Car("Ford", "Focus", 2001));
        cars.add(new Car("Vaz", "2101", 1988));


        return cars.stream()
                .filter(car -> count == null || count < 0 || count > cars.size() || cars.indexOf(car) < count).toList();
    }
}
