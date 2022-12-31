package MyBatis.pojo.Dish;

public class Beef extends Dish{

    private static Beef instance = null;

    private Beef() {
        this.name = "Beef";
        this.ingredient = "Beef";
        this.price = 10.0;}

    private Beef(String name, String ingredient, float price){
        this.name = name;
        this.ingredient = ingredient;
        this.price = price;
    }

    public static Beef getDish(){
        if(instance == null) instance = new Beef();

        return instance;

    }

}
