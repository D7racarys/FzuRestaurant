package web.sevice.client;

import MyBatis.pojo.Dish.*;
import com.alibaba.fastjson.JSON;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

import static web.utils.SqlSessionFactoryUtils.getSqlSessionFactory;

@WebServlet("/orderPage")
public class orderPage extends HttpServlet {

    static SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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

        response.setContentType("text/html;charset=utf-8");

        System.out.println(json);

        response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
