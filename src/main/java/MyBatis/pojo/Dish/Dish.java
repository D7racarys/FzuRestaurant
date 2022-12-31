package MyBatis.pojo.Dish;

public class Dish {
    protected String name;
    protected String ingredient;
    protected double price;


    public double getPrice() {
        return this.price;
    }
    public String toString(){
        return "[name:"+this.name+",ingredients:"+this.ingredient+",price:"+this.price+"]";
    }
    public String getName(){
        return this.name;
    }
    public String getIngredient(){
        return this.ingredient;
    }
}
