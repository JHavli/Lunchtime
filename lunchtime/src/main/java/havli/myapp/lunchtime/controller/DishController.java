package havli.myapp.lunchtime.controller;

import havli.myapp.lunchtime.model.Dish;
import havli.myapp.lunchtime.service.DishService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DishController {
    private DishService dishService;

    public DishController(DishService dishService) {
        this.dishService = dishService;
    }

    @PostMapping("/home")
    public String addDish(Model model, Dish dish) {
        int result = dishService.addDish(dish);
        if (result <1) {
            model.addAttribute("error", String.format("Could not add %s", dish.getDishName()));
        }
        model.addAttribute("success", String.format("successfully added %s", dish.getDishName()));

        var dishes = dishService.getDishes();
        model.addAttribute("dishes",dishes);
        return "home";
    }

    @GetMapping("/home")
    public String getHome(Model model) {
        model.addAttribute("message", "Available Dishes:");
        List<Dish> dishes = dishService.getDishes();
        model.addAttribute("dishes", dishes);
        return "home";
    }
}
