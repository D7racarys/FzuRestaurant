package MyBatis.pojo.Dish;

public class Vegetables extends Dish{

    private static Vegetables instance = null;

    private Vegetables() {
        this.name = "Vegetables";
        this.ingredient = "Vegetables";
        this.price = 10.0;}

    private Vegetables(String name, String ingredient, float price){
        this.name = name;
        this.ingredient = ingredient;
        this.price = price;
    }

    public static Vegetables getDish(){
        if(instance == null) instance = new Vegetables();

        return instance;

    }


}
