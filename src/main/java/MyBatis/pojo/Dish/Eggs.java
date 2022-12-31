package MyBatis.pojo.Dish;

public class Eggs extends Dish{

    private static Eggs instance = null;

    private Eggs() {
        this.name = "Eggs";
        this.ingredient = "Eggs";
        this.price = 10.;}

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


}
