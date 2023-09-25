public class ItemIdly implements OrderMenu{
    public ItemIdly(MenuItem idly){
        System.out.println("Making Idly");
    }
    @Override
    public void prepare() {
        System.out.println("Idly Ready");
    }
}
