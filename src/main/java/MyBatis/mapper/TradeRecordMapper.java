package MyBatis.mapper;

import MyBatis.pojo.TradeRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TradeRecordMapper {

    List<TradeRecord> selectAll();

    // 支持用户id和餐食种类查找
    List<TradeRecord> selectByCons(@Param("id") String id);

}
