package MyBatis.pojo.Dish;

public class Vegetables implements Dish{
    String name = "Vegetables";
    String ingredient = "Vegetables";
    float price = 10.0f;

    private static Vegetables instance = null;

    private Vegetables() {}

    private Vegetables(String name, String ingredient, float price){
        this.name = name;
        this.ingredient = ingredient;
        this.price = price;
    }

    public static Vegetables getDish(){
        if(instance == null) instance = new Vegetables();

        return instance;

    }

    public double getPrice(){
        return instance.price;
    }

    public String toString(){
        return "[name:"+instance.name+",ingredients:"+instance.ingredient+"price:"+instance.price+"]";
    }
}
