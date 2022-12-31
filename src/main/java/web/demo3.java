package web;

import MyBatis.pojo.Dish.*;
import com.alibaba.fastjson.JSON;

import java.util.ArrayList;

public class demo3 {
    public static void main(String[] args) {
        Beans beans = Beans.getDish();
        Beef beef = Beef.getDish();
        Eggs eggs = Eggs.getDish();
        MainFood mainFood = MainFood.getDish();
        Mutton mutton = Mutton.getDish();
        Pork pork = Pork.getDish();
        SeaFood seaFood = SeaFood.getDish();
        Vegetables vegetables = Vegetables.getDish();

        ArrayList<Dish> arrayList = new ArrayList<>();

        arrayList.add(beans);
        arrayList.add(beef);
        arrayList.add(eggs);
        arrayList.add(mainFood);
        arrayList.add(mutton);
        arrayList.add(pork);
        arrayList.add(seaFood);
        arrayList.add(vegetables);

        String json = JSON.toJSONString(arrayList);

        for (Dish dish : arrayList) {
            System.out.println(dish.toString());
        }

        System.out.println(json);
    }
}
