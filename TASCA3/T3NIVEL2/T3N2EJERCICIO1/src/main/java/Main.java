import java.util.HashSet;

public class Main {
    public static void main(String[] args){

        HashSet<Restaurant> restaurants = new HashSet<>();

        restaurants.add(new Restaurant("Mamma Mia Pizzeria", 4));
        restaurants.add(new Restaurant("Mamma Mia Pizzeria", 4));
        restaurants.add(new Restaurant("Spicy Meatball", 1));
        restaurants.add(new Restaurant("Tasty Tortellini", 5));

        for (Restaurant restaurant : restaurants){
            System.out.println(restaurant.toString());
        }

    }
}
