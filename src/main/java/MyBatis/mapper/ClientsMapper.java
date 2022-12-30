package MyBatis.mapper;

import java.util.List;

import MyBatis.pojo.Clients;

public interface ClientsMapper {

    List<Clients> selectAll();

    Clients selectByIdPwd(Clients client);

}
