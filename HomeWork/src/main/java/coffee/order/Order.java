package coffee.order;

public class Order {
    private Integer orderNumber;
    private String buyersName;

    public Order(String buyersName) {
        this.buyersName = buyersName;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getBuyersName() {
        return buyersName;
    }

    public void setBuyersName(String buyersName) {
        this.buyersName = buyersName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", buyersName='" + buyersName + '\'' +
                '}' + '\n';
    }
}
