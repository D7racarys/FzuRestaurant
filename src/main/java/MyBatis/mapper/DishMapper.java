package MyBatis.mapper;

import MyBatis.pojo.Dish.Dish;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DishMapper {

    List<Dish> selectAll();

    List<Dish> selectByType(@Param("dishType") String dishType);

    void addDish(Dish dish);

    void deleteDish(@Param("type") String type);

    void updateDish(Dish dish);

}
