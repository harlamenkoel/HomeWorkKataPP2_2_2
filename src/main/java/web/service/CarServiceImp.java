package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private final CarDaoImp carDao;

    public CarServiceImp(CarDaoImp carsDao) {
        this.carDao = carsDao;
    }


    @Override
    public List<Car> getCarCount(Integer count) {
        return carDao.getCarCount(count);
    }
}
