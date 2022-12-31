package MyBatis.pojo.Dish;

public class Dish {
    protected String name;
    protected String ingredient;
    protected double price;


    public double getPrice() {
        System.out.println("正在调用父类dish的价格");
        return 0;
    }
}
