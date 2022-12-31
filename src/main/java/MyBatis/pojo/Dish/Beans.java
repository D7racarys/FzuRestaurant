package MyBatis.pojo.Dish;

public class Beans extends Dish{

    private static Beans instance = null;

    private Beans() {
        this.name = "Beans";
        this.ingredient = "Beans";
        this.price = 10.0;
    }

    private Beans(String name, String ingredient, float price){
        this.name = name;
        this.ingredient = ingredient;
        this.price = price;
    }

    public static Beans getDish(){
        if(instance == null) instance = new Beans();

        return instance;

    }



}
