package MyBatis.pojo.Dish;

public class Pork extends Dish{

    private static Pork instance = null;

    private Pork() {
        this.name = "pork";
        this.ingredient = "pork";
        this.price = 10.0;}

    private Pork(String name, String ingredient, float price){
        this.name = name;
        this.ingredient = ingredient;
        this.price = price;
    }

    public static Pork getDish(){
        if(instance == null) instance = new Pork();

        return instance;

    }

    public double getPrice(){
        return instance.price;
    }

    public String toString(){
        return "[name:"+instance.name+",ingredients:"+instance.ingredient+"price:"+instance.price+"]";
    }
}
