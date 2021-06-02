package lesson11;

public enum EnumExample {

    APPLE(100), SAMSUNG(80, "Samsung Charge"), HUAWEI(70, "Huawei Charge");

    int price;
    String charge;

    EnumExample(int price, String charge) {
        this.price = price;
        this.charge = charge;
    }

    EnumExample(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getCharge() {
        return charge;
    }

    @Override
    public String toString() {
        return "EnumExample{" +
                "price=" + price +
                ", charge='" + charge + '\'' +
                '}';
    }
}

