package MyBatis.pojo;

import java.util.ArrayList;
import java.util.List;

public class CurrentTradeList {

    static private ArrayList<TradeRecord> currentList = new ArrayList<>();

    static private int total = 0;

    static private int isDoing = 1;

    public void printObj() {
        for (TradeRecord tradeRecord : currentList) {
            System.out.println(tradeRecord.toString());
        }
    }

    public void addDish(TradeRecord tradeRecord){
        currentList.add(tradeRecord);
        total += 1;
        tradeRecord.setOrder(total - isDoing + 1);

    }

    public void finishDish(){
        isDoing += 1;
    }


}
