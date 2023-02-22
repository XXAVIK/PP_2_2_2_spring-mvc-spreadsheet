package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Car;
import web.Service.CarService;
import web.Service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(params = {"count"})
    public String showCarsById(@RequestParam(value = "count", required = false) int id, ModelMap model) {
        model.addAttribute("cars", carService.showCar(id));
        return "cars-by-id";
    }

    @GetMapping()
    public String showDefaultCarList(ModelMap model) {
        model.addAttribute("cars", carService.showAllCars());
        return "cars-by-id";
    }


}
