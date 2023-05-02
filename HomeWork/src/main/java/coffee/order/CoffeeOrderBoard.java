package coffee.order;

import java.util.*;

public class CoffeeOrderBoard {
    private Integer last;

    private LinkedList<Order> listOrder = new LinkedList<>();

    public LinkedList<Order> getListOrder() {
        return listOrder;
    }

    public boolean add(Order order) {
        Objects.requireNonNull(order);
        if (listOrder.isEmpty()) {
            listOrder.add(order);
            order.setOrderNumber(last = listOrder.size());
            return true;
        } else {
            listOrder.add(order);
            last++;
            order.setOrderNumber(last);
            return true;
        }
    }

    public Order deliver() {
        if (listOrder.isEmpty()) {
            throw new NullPointerException("No orders");
        }
        return listOrder.removeFirst();
    }

    public Order deliverByNumber(int numberOrder) {
        if (numberOrder == 0) {
            throw new NoSuchElementException("No order number %s".formatted(numberOrder));
        }
        for (Order run : listOrder) {
            if (run.getOrderNumber().equals(numberOrder)) {
                listOrder.remove(run);
                return run;
            }
        }
        throw new NoSuchElementException("No order number %s".formatted(numberOrder));
    }

    public String draw() {
        StringBuilder str = new StringBuilder();
        for (Order output : listOrder) {
            str.append("%s | %s \n".formatted(output.getOrderNumber(), output.getBuyersName()));
        }
        return "Num" + " | " + "Name" + "\n" + str;

    }
}
