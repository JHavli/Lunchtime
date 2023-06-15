package havli.myapp.lunchtime.mapper;

import havli.myapp.lunchtime.model.Dish;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DishMapper {

    @Select("SELECT * FROM DISHES")
    List<Dish> selectDishes();

    @Insert("INSERT INTO DISHES (name, price) VALUES(#{dishName}, #{price})")
    int insertDish(Dish dish);
}
