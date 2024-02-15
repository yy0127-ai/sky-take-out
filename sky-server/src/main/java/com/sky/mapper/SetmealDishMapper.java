package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealDishMapper {
    List<SetmealDish> getByIds(List<Long> ids);

    void insert(List<SetmealDish> setmealDishes);

    void deleteBySetmealIds(List<Long> ids);

    @Select("select * from setmeal_dish where setmeal_id = #{id}")
    List<SetmealDish> getById(Long id);

    @Delete("delete from setmeal_dish where setmeal_id = #{setmealId}")
    void deleteById(Long setmealId);
}
