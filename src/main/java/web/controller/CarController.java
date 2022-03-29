package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String cars (@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("black", 2, "BMW"));
        carList.add(new Car("red", 3, "Audi"));
        carList.add(new Car("blue", 4, "Hyundai"));
        carList.add(new Car("white", 5, "MB"));
        carList.add(new Car("yellow", 6, "KIA"));
        carList = CarService.carsCount(carList,allCars);
        model.addAttribute("carList",carList);

        return "car";
    }
}
