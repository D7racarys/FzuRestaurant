package MyBatis.pojo.Dish;

public class MainFood extends Dish{

    private static MainFood instance = null;

    private MainFood() {
        this.name = "MainFood";
        this.ingredient = "MainFood";
        this.price = 10.0;}

    private MainFood(String name, String ingredient, float price){
        this.name = name;
        this.ingredient = ingredient;
        this.price = price;
    }

    public static MainFood getDish(){
        if(instance == null) instance = new MainFood();

        return instance;

    }

    public double getPrice(){
        return instance.price;
    }


}
