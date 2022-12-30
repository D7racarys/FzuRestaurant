package MyBatis.pojo.Dish;

public class Mutton implements Dish{
    String name = "Mutton";
    String ingredient = "Mutton";
    float price = 10.0f;

    private static Mutton instance = null;

    private Mutton() {}

    private Mutton(String name, String ingredient, float price){
        this.name = name;
        this.ingredient = ingredient;
        this.price = price;
    }

    public static Mutton getDish(){
        if(instance == null) instance = new Mutton();

        return instance;

    }

    public double getPrice(){
        return instance.price;
    }

    public String toString(){
        return "[name:"+instance.name+",ingredients:"+instance.ingredient+"price:"+instance.price+"]";
    }
}
