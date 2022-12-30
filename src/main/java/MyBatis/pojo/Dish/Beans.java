package MyBatis.pojo.Dish;

public class Beans implements Dish{
    String name = "Beans";
    String ingredient = "Beans";
    float price = 10.0f;

    private static Beans instance = null;

    private Beans() {}

    private Beans(String name, String ingredient, float price){
        this.name = name;
        this.ingredient = ingredient;
        this.price = price;
    }

    public static Beans getDish(){
        if(instance == null) instance = new Beans();

        return instance;

    }

    public double getPrice(){
        return instance.price;
    }

    public String toString(){
        return "[name:"+instance.name+",ingredients:"+instance.ingredient+"price:"+instance.price+"]";
    }
}
