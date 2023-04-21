package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImp;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.List;


@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCars(
            @RequestParam(value = "count", required = false) Integer count,
            ModelMap model) {

        List<Car> list = carService.getCarCount(count);

        model.addAttribute("cars", list);
        model.addAttribute("count", count);
        return "cars";
    }
}