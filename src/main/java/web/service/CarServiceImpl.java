package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    CarDao carDao;

    public List<Car> listOfCars (int count) {
        return count < 5 ? carDao.listOfCars(count) : carDao.listOfCars(carDao.listOfAllCars().size());
    }
    public List<Car> listOfAllCars() {
        return carDao.listOfAllCars();
    }
}
