public class IdlyFactory implements AbstractOrderMenu{
    @Override
    public OrderMenu Order() {
        return new ItemIdly(MenuItem.Idly);
    }
}
