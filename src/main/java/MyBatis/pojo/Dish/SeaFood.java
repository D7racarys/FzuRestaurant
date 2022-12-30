package MyBatis.pojo.Dish;

public class SeaFood implements Dish{
    String name = "SeaFood";
    String ingredient = "SeaFood";
    float price = 10.0f;

    private static SeaFood instance = null;

    private SeaFood() {}

    private SeaFood(String name, String ingredient, float price){
        this.name = name;
        this.ingredient = ingredient;
        this.price = price;
    }

    public static SeaFood getDish(){
        if(instance == null) instance = new SeaFood();

        return instance;

    }

    public double getPrice(){
        return instance.price;
    }

    public String toString(){
        return "[name:"+instance.name+",ingredients:"+instance.ingredient+"price:"+instance.price+"]";
    }
}
