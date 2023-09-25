public class car{
    private String Brand;
    private int Price;

    private car(Builder builder) {
        this.Brand= builder.Brand;
        this.Price= builder.Price;
        System.out.println(Brand+" Car Fetched");
    }

    public String getBrand(){
        return Brand;
    }
    public int Price(){
        return Price;
    }

    public static class Builder{
        private String Brand;
        private int Price;

        public Builder(String brand,int price){
            this.Brand=brand;
            this.Price=price;
        }

        public car build(){
            return new car(this);
        }
    }
}
