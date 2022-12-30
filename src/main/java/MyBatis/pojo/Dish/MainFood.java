package MyBatis.pojo.Dish;

public class MainFood implements Dish{
    String name = "MainFood";
    String ingredient = "MainFood";
    float price = 10.0f;

    private static MainFood instance = null;

    private MainFood() {}

    private MainFood(String name, String ingredient, float price){
        this.name = name;
        this.ingredient = ingredient;
        this.price = price;
    }

    public static MainFood getDish(){
        if(instance == null) instance = new MainFood();

        return instance;

    }

    public double getPrice(){
        return instance.price;
    }

    public String toString(){
        return "[name:"+instance.name+",ingredients:"+instance.ingredient+"price:"+instance.price+"]";
    }
}
