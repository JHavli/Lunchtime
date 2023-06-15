package havli.myapp.lunchtime.service;


import havli.myapp.lunchtime.mapper.DishMapper;
import havli.myapp.lunchtime.model.Dish;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DishService {

    private final DishMapper dishMapper;

    public DishService(DishMapper dishMapper) {
        this.dishMapper = dishMapper;
    }

    public List<Dish> getDishes() {
        List<Dish> dishes = dishMapper.selectDishes();
        return dishes;
    }

    public int addDish(Dish dish){
        return dishMapper.insertDish(dish);
    }
}
