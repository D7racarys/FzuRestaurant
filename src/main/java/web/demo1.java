package web;

import MyBatis.mapper.ClientsMapper;
import MyBatis.pojo.Clients;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

import static web.utils.SqlSessionFactoryUtils.getSqlSessionFactory;

public class demo1 {

    static private SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();

    public static void main(String[] args) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        ClientsMapper clientsMapper = sqlSession.getMapper(ClientsMapper.class);

        List<Clients> clientsList = clientsMapper.selectAll();

        for (Clients clients : clientsList) {
            System.out.println(clients);
        }
    }

}
