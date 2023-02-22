package web.Service;

import web.Car;

import java.util.List;

public interface CarService {
    public List<Car> showCar(int id);

    public List<Car> showAllCars();

}
