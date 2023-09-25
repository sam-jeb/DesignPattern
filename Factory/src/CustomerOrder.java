public class CustomerOrder extends OrderFactory{
    public static void main(String[] args){

        OrderMenu idly= OrderFactory.Order(new IdlyFactory());
    }
}
