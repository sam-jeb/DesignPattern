
public class OrderFactory {

    public static OrderMenu Order(AbstractOrderMenu item) {
        return item.Order();
    }
}
