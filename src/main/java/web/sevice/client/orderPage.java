package web.sevice.client;

import MyBatis.pojo.Dish.Beans;
import MyBatis.pojo.Dish.Beef;
import MyBatis.pojo.Dish.Dish;
import MyBatis.pojo.Dish.Eggs;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import static web.utils.SqlSessionFactoryUtils.getSqlSessionFactory;

@WebServlet("/orderPage")
public class orderPage extends HttpServlet {

    static SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Beans beans = Beans.getDish();
        Beef beef = Beef.getDish();
        Eggs dish = Eggs.getDish();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
