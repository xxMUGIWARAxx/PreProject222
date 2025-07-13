package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private int carCount;
    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car(++carCount, "Toyota", 186));
        cars.add(new Car(++carCount, "BMW", 350));
        cars.add(new Car(++carCount, "Honda", 144));
        cars.add(new Car(++carCount, "Audi", 1169));
        cars.add(new Car(++carCount, "Mercedes", 210));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream()
                .limit(Math.max(0, Math.min(count, cars.size())))
                .toList();
    }
}
