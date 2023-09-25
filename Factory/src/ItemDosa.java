public class ItemDosa implements OrderMenu{
    public ItemDosa(MenuItem dosa){
        System.out.println("Making Dosa");
        //System.out.println(idly);
    }



    @Override
    public void prepare() {
        System.out.println("Dosa Ready");
    }
}
