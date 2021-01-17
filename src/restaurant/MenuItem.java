package restaurant;

public class MenuItem {
    private String description;
    private String category;
    private double price = 0.0;

    public void setPrice(double newPrice){
        price=newPrice;
    }
    public double getPrice(){
        return price;
    }

    public void setDescription(String newDescription){
        description=newDescription;
    }
    public String getDescription(){
        return description;
    }

    public void setCategory(String newCategory){
        category=newCategory;
    }
    public String getCategory(){
        return category;
    }


}
