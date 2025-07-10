package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {
    CarService cars = new CarServiceImpl();

    @GetMapping()
    public String allCars(ModelMap model) {
        model.addAttribute("messages",cars.getCars(5));
        return "cars";
    }
    @GetMapping("/{count}")
    public String printCars(@PathVariable("count") int count, ModelMap model) {
        model.addAttribute("messages", cars.getCars(count));
        return "cars";
    }
}
