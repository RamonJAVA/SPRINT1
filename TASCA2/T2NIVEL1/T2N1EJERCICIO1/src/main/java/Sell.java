import java.util.ArrayList;

public class Sell {

    private ArrayList <Product> products;
    private double totalPrice;

    public Sell() {
        this.products = new ArrayList<Product>();
        this.totalPrice = totalPrice;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void calculateTotalPrice () throws EmptyBasketException {

        if (products.isEmpty()){
            throw new EmptyBasketException("To calculate the total price the basket can't be empty.");

        }else {
            for (Product product : products){
                totalPrice += product.getPrice();
                System.out.println(totalPrice);
            }
        }

    }

}
