public class Burgers implements Price, Name, Menu{

    @Override
    public String getFoodMenu() {
        return "Burger";
    }

    @Override
    public String[] getFoodName() {
        return new String[] {"", "Chicken burger", "Beef burger", "Fish burger"};
    }

    @Override
    public int[] getFoodPrice() {
        return new int[] {0, 600, 800, 1000};
    }
}