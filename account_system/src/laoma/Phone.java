package laoma;

public class Phone {
    String brand;
    double price;
    int size;

    public Phone(String brand, double price, int size) {
        this.brand = brand;
        this.price = price;
        this.size = size;
    }

    public Phone() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
