package MyBatis.pojo;

import MyBatis.pojo.Dish.Dish;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class Clients {

    private String id;
    private String password;
    private float account;
    private int amount = 0;// 记录用户点单数

    public Clients() {
    }

    public Clients(String id, String password, float account) {
        this.id = id;
        this.password = password;
        this.account = account;
    }

    public TradeRecord orderDish(Map<Dish, Integer> list, String tableID) {
        double sum = 0;
        for (Dish dish : list.keySet()) {
            sum += dish.getPrice() * list.get(dish);
        }

        if(this.account < sum) return null;
        else {
            this.amount += 1;
            TradeRecord tradeRecord = new TradeRecord();
            tradeRecord.setClientsID(this.id);

            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Timestamp now = new Timestamp(System.currentTimeMillis());//获取系统当前时间
            String str = df.format(now);
            Timestamp ts = Timestamp.valueOf(str);
            tradeRecord.setOrderTime(ts);

            tradeRecord.setId(this.id+this.amount);
            tradeRecord.setTableID(tableID);
            tradeRecord.setDish(list);

            return tradeRecord;
        }

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
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return account
     */
    public float getAccount() {
        return account;
    }

    /**
     * 设置
     * @param account
     */
    public void setAccount(float account) {
        this.account = account;
    }

    public String toString() {
        return "Clients{id = " + id + ", password = " + password + ", account = " + account + "}";
    }
}
