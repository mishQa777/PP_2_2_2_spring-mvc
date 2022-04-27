package web.Dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> listOfCars (int count);
    List<Car> listOfAllCars();
}
