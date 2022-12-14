package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Model1", 111, "v1"));
        cars.add(new Car("Model2", 222, "v2"));
        cars.add(new Car("Model3", 333, "v3"));
        cars.add(new Car("Model4", 444, "v4"));
        cars.add(new Car("Model5", 555, "v5"));
        cars.add(new Car("Model6", 666, "v6"));
        cars.add(new Car("Model7", 777, "v7"));
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public List<Car> getCars (int count) {
        if (count >= 5) {
            count = 5;
            return getAllCars();
        } else {
            return (count < cars.size() )? cars.subList(0,count) : cars;
        }
    }

}
