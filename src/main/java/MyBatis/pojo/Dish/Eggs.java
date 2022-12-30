package MyBatis.pojo.Dish;

public class Eggs implements Dish{
    String name = "Eggs";
    String ingredient = "Eggs";
    float price = 10.0f;

    private static Eggs instance = null;

    private Eggs() {}

    private Eggs(String name, String ingredient, float price){
        this.name = name;
        this.ingredient = ingredient;
        this.price = price;
    }

    public static Eggs getDish(){
        if(instance == null) instance = new Eggs();

        return instance;

    }

    public double getPrice(){
        return instance.price;
    }
    public String toString(){
        return "[name:"+instance.name+",ingredients:"+instance.ingredient+"price:"+instance.price+"]";
    }

}
