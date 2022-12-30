package web;

import MyBatis.pojo.Clients;
import MyBatis.pojo.CurrentTradeList;
import MyBatis.pojo.Dish.Dish;
import MyBatis.pojo.Dish.Pork;
import MyBatis.pojo.TradeRecord;

import java.util.HashMap;
import java.util.Map;

public class process {

    public static void main(String[] args) {
        CurrentTradeList currentTradeList = new CurrentTradeList();
        Clients clients = new Clients();
        clients.setAccount(100f);
        Map<Dish, Integer> map = new HashMap<>();
        map.put(Pork.getDish(), 1);
        String tableID = "101";
        TradeRecord tradeRecord = clients.orderDish(map, tableID);
        currentTradeList.addDish(tradeRecord);
        System.out.println("isDoing:"+tradeRecord.getOrder());
        currentTradeList.printObj();


    }

}
