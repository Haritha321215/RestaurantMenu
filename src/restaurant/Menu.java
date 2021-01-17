package restaurant;

public class Menu {
    public static void main(String[] args) {
        MenuItem biryani = new MenuItem();

        biryani.setPrice(30.00);
        System.out.println("Price:"+biryani.getPrice());

        biryani.setDescription("Prepared with chicken, rice and spices.");
        System.out.println("Description:"+biryani.getDescription());

        biryani.setCategory("Main course");
        System.out.println("Category:"+biryani.getCategory());

    }
}
