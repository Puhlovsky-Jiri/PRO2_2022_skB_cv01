package models;

public class PizzaMenuItem {
    private String name;
    private int price;

    public PizzaMenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        PizzaMenuItem pizza = (PizzaMenuItem) obj;
        if(!name.equals(pizza.getName()))
            return false;
        if(price != pizza.getPrice())
            return false;

        return super.equals(obj);
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
