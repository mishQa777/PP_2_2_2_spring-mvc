package web.Dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    private List<Car> cars;

    public CarDaoImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "M5", "V8"));
        cars.add(new Car("Bugatti", "Veyron", "W16"));
        cars.add(new Car("Lamborghini", "Aventador", "V12"));
        cars.add(new Car("Audi", "R8", "V10"));
        cars.add(new Car("VW", "Passat", "VR6"));

    }

        @Override
    public List<Car> listOfCars(int count) {
        return cars.subList(0, count);
    }

    public List<Car> listOfAllCars() {
        return this.cars;
    }
}
