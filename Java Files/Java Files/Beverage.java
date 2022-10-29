public class Beverages implements Price, Name, Menu{

    @Override
    public String getFoodMenu() {
        return "Beverages";
    }

    @Override
    public String[] getFoodName() {
        return new String[]{"", "Coke", "Sprite", "Fanta", "Coffee", "Tea"};
    }

    @Override
    public int[] getFoodPrice() {
        return new int[] {0, 200, 190, 200, 300, 250};
    }
}