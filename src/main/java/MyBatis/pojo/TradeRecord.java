package MyBatis.pojo;

import MyBatis.pojo.Dish.Dish;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class TradeRecord {

    private String id;
    private String tableID;
    private String clientsID;
    private Map<Dish, Integer> dish;
    private Timestamp orderTime;
    private Timestamp finishTime;
    private int order;


    public TradeRecord() {
    }

    public TradeRecord(String id, String tableID, String clientsID, Map<Dish, Integer> dish, Timestamp orderTime, Timestamp finishTime) {
        this.id = id;
        this.tableID = tableID;
        this.clientsID = clientsID;
        this.dish = dish;
        this.orderTime = orderTime;
        this.finishTime = finishTime;
    }


    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }


    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return tableID
     */
    public String getTableID() {
        return tableID;
    }

    /**
     * 设置
     * @param tableID
     */
    public void setTableID(String tableID) {
        this.tableID = tableID;
    }

    /**
     * 获取
     * @return clientsID
     */
    public String getClientsID() {
        return clientsID;
    }

    /**
     * 设置
     * @param clientsID
     */
    public void setClientsID(String clientsID) {
        this.clientsID = clientsID;
    }

    /**
     * 获取
     * @return dish
     */
    public Map<Dish, Integer> getDish() {
        return dish;
    }

    /**
     * 设置
     * @param dish
     */
    public void setDish(Map<Dish, Integer> dish) {
        this.dish = dish;
    }

    /**
     * 获取
     * @return orderTime
     */
    public Timestamp getOrderTime() {
        return orderTime;
    }

    /**
     * 设置
     * @param orderTime
     */
    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * 获取
     * @return finishTime
     */
    public Timestamp getFinishTime() {
        return finishTime;
    }

    /**
     * 设置
     * @param finishTime
     */
    public void setFinishTime(Timestamp finishTime) {
        this.finishTime = finishTime;
    }

    public String toString() {
        for (Dish dish1 : dish.keySet()) {
            System.out.print(dish1.toString()+":");
            System.out.println(dish.get(dish1));
        }
        return "TradeRecord{id = " + id + ", tableID = " + tableID + ", clientsID = " + clientsID + ", dish = " + dish + ", orderTime = " + orderTime + ", finishTime = " + finishTime + "}";
    }
}
