package MyBatis.pojo.Dish;

public class Beef implements Dish{
    String name = "Beef";
    String ingredient = "Beef";
    float price = 10.0f;

    private static Beef instance = null;

    private Beef() {}

    private Beef(String name, String ingredient, float price){
        this.name = name;
        this.ingredient = ingredient;
        this.price = price;
    }

    public static Beef getDish(){
        if(instance == null) instance = new Beef();

        return instance;

    }
    public double getPrice(){
        return instance.price;
    }

    public String toString(){
        return "[name:"+instance.name+",ingredients:"+instance.ingredient+"price:"+instance.price+"]";
    }
}
