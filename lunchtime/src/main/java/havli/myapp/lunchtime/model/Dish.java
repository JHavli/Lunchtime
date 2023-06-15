package havli.myapp.lunchtime.model;

public class Dish {
    private Integer id;
    private String dishName;
    private double price;

    public Dish(Integer id, String dishName, double price) {
        this.id = id;
        this.dishName = dishName;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
