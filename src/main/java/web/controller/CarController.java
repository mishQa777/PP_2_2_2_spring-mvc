package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.service.CarService;

@Controller
public class CarController {

    @Autowired
    CarService carService;

    @RequestMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required=false) Integer count, Model model) {
        model.addAttribute("cars", count != null ? carService.listOfCars(count) : carService.listOfAllCars());
        return "cars";
    }
}
