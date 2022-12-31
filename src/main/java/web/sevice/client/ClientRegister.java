package web.sevice.client;

import MyBatis.mapper.ClientsMapper;
import MyBatis.pojo.Clients;
import com.alibaba.fastjson.JSON;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;

import static web.utils.SqlSessionFactoryUtils.getSqlSessionFactory;

@WebServlet("/Servlet")
public class ClientRegister extends HttpServlet {

    static SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BufferedReader br = request.getReader();

        String json = br.readLine();// 得到json

        System.out.println("clientsRegister"+json);

        Map map = JSON.parseObject(json, Map.class);

        for (Object o : map.keySet()) {
            System.out.println(map.get(o));
        }

        String username = (String) map.get("username");

        String password = (String) map.get("password");

        response.setContentType("text/html;charset=utf-8");

        SqlSession sqlSession = sqlSessionFactory.openSession();

        ClientsMapper clientsMapper = sqlSession.getMapper(ClientsMapper.class);

        if(clientsMapper.selectById(username) != null){

            System.out.println("用户名重复");

            response.getWriter().write("false");
        }
        else {

            Clients clients = new Clients(username, password, 0f);

            clientsMapper.addClient(clients);

            response.getWriter().write("true");

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
