package MyBatis.pojo.Dish;

public class Mutton extends Dish{

    private static Mutton instance = null;

    private Mutton() {
        this.name = "Mutton";
        this.ingredient = "Mutton";
        this.price = 10.0;}

    private Mutton(String name, String ingredient, float price){
        this.name = name;
        this.ingredient = ingredient;
        this.price = price;
    }

    public static Mutton getDish(){
        if(instance == null) instance = new Mutton();

        return instance;

    }



}
