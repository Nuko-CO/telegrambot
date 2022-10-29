public class Fries implements Price, Name, Menu{
    @Override
    public String getFoodMenu() {
        return "Fries";
    }

    @Override
    public String[] getFoodName() {
        return new String[]{"", "Big sized fries", "Medium sized fries", "Small sized fries"};
    }

    @Override
    public int[] getFoodPrice() {
        return new int[] {0, 600, 540, 450};
    }
}