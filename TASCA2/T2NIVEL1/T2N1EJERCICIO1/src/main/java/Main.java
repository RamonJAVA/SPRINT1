import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        Sell sell = new Sell();

        Product product1 = new Product("galletas", 2.99);
        Product product2 = new Product("leche", 6.95);

        /*try{

            for (Product product : sell.getProducts()){
                System.out.println(product);
            }

            System.out.println("The total price is: ");
            sell.calculateTotalPrice();

        }catch (EmptyBasketException e){
            System.err.println(e.getMessage());
        }*/

        try{
            System.out.println(sell.getProducts().get(3));

        }catch (IndexOutOfBoundsException e){
            System.out.println("No product in that position.");
        }
    }
}
