
public class yourCar {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price > 1000){
            price = 1000;
        }
        this.price = price;
    }
}
