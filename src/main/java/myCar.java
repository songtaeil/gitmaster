import org.springframework.data.domain.Page;

public class  myCar <T> {
    private String carName;
    private int price;
    
    public String getCarName(){
        return carName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void run() {
        Page<T> page = new Page<T>();
        page.getNumber();
    }
}
