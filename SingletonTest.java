public class SingletonTest {
    public static void main(String[] args){

        TesterClass obj = TesterClass.getInstance();

    }

}
class TesterClass{
    private static volatile TesterClass instance; //to prevent partially constructed objects

    private TesterClass(){}
    public static TesterClass getInstance(){
        synchronized (TesterClass.class) { //to prevent the access from multiple threads at the same time
            if (instance == null) { //check for creation of only one instance
                instance = new TesterClass();
                System.out.println("Instance Created");
            }
        }
        return instance;
    }
}