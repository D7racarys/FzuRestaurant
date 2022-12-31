package MyBatis.mapper;

import java.util.List;

import MyBatis.pojo.Clients;
import org.apache.ibatis.annotations.Param;

public interface ClientsMapper {

    List<Clients> selectAll();

    Clients selectByIdPwd(Clients client);

    Clients selectById(@Param("id") String id);

    void addClient(Clients clients);

}
