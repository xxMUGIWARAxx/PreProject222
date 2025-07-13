package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarsController {
    private final CarService carService;

    @Autowired
    public CarsController(CarService cars) {
        this.carService = cars;
    }

    @GetMapping
    public String allCars(ModelMap model) {
        model.addAttribute("messages", carService.getCars(5));
        return "cars";
    }

    @GetMapping(params = "count")
    public String printCars(@RequestParam("count") int count, ModelMap model) {
        model.addAttribute("messages", carService.getCars(count));
        return "cars";
    }
}
