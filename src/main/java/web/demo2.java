package web;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo2 {

    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Timestamp now = new Timestamp(System.currentTimeMillis());//获取系统当前时间
        String str = df.format(now);
        Timestamp ts = Timestamp.valueOf(str);

    }
}
