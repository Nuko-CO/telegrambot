public class CalculateThePrice {
    static int totalPrice = 0;

    public int restartOrder() {
        return totalPrice-=totalPrice;
    }

    public void setTotalPrice(int a) {
        totalPrice += a;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}