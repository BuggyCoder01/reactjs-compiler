package Classes;

public class Price {

    float price;
    public void PrintAst(){

        System.out.println(price);

    }
    @Override
    public String toString() {
        String s="";
        s="price:'" + price;
        return s;

    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}
