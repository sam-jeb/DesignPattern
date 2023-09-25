public class DosaFactory implements AbstractOrderMenu{
    @Override
    public OrderMenu Order() {
        return new ItemDosa(MenuItem.Dosa);
    }
}
