package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {
    List<SetmealDish> getByIds(List<Long> ids);

    void insert(List<SetmealDish> setmealDishes);
}
