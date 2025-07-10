package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    private static int CARS_COUNT;
    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car(++CARS_COUNT, "Toyota", 186));
        cars.add(new Car(++CARS_COUNT, "BMW", 350));
        cars.add(new Car(++CARS_COUNT, "Honda", 144));
        cars.add(new Car(++CARS_COUNT, "Audi", 1169));
        cars.add(new Car(++CARS_COUNT, "Mercedes", 210));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream()
                .limit(Math.max(0, Math.min(count, cars.size())))
                .toList();
    }
}
