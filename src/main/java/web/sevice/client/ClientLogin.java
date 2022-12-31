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

@WebServlet("/clientLogin")
public class ClientLogin extends HttpServlet {

    static SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BufferedReader br = request.getReader();

        String json = br.readLine();// 得到json

        System.out.println("clientsLogin"+json);

        Map map = JSON.parseObject(json, Map.class);

        for (Object o : map.keySet()) {
            System.out.println(map.get(o));
        }

        String username = (String) map.get("username");

        String password = (String) map.get("password");

        Clients clients = new Clients();

        clients.setId(username);

        clients.setPassword(password);

        response.setContentType("text/html;charset=utf-8");

        SqlSession sqlSession = sqlSessionFactory.openSession();

        ClientsMapper clientsMapper = sqlSession.getMapper(ClientsMapper.class);

        Clients clients1 = clientsMapper.selectByIdPwd(clients);

        if(clients1 != null){

            System.out.print(clients1);

            System.out.println("登陆成功");

            response.getWriter().write("true");

        }
        else {
            System.out.println("用户名或密码错误");

            response.getWriter().write("false");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
