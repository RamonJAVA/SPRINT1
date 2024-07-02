import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbersForwards = new ArrayList<>();
        ArrayList <Integer> numbersBackwards = new ArrayList<>();

        Integer prev;

        numbersForwards.add(1);
        numbersForwards.add(2);
        numbersForwards.add(3);
        numbersForwards.add(4);
        numbersForwards.add(5);

        ListIterator<Integer> numberIterator = numbersForwards.listIterator();

        System.out.println("Forwards");

        while (numberIterator.hasNext()) {
            System.out.print(numberIterator.next() + " ");
        }

        System.out.println("\n");

        System.out.println("Backwards");

        while (numberIterator.hasPrevious()) {
            prev = numberIterator.previous();
            numbersBackwards.add(prev);
            System.out.print(prev + " ");

        }

//      System.out.println(numbersBackwards);
    }

}
