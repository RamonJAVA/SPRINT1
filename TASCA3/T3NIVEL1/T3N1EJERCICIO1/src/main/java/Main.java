import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList <Month> months = new ArrayList<>();


        Month month1 = new Month ("January");
        Month month2 = new Month ("February");
        Month month3 = new Month ("March");
        Month month4 = new Month ("April");
        Month month5 = new Month ("May");
        Month month6 = new Month ("June");
        Month month7 = new Month ("July");
        Month month8 = new Month ("August");
        Month month9 = new Month ("September");
        Month month10 = new Month ("October");
        Month month11 = new Month ("November");
        Month month12 = new Month ("December");

        months.add(month1);
        months.add(month2);
        months.add(month3);
        months.add(month4);
        months.add(month5);
        months.add(month6);
        months.add(month7);
        months.add(month9);
        months.add(month10);
        months.add(month11);
        months.add(month12);

        System.out.println("Without August");

        for (int i = 0; i<months.size(); i++) {
            System.out.println(months.get(i).getName());
        }

        System.out.println("\n");

        System.out.println("With August");

        months.add(7, month8);

        for (int i = 0; i<months.size(); i++) {
            System.out.println(months.get(i).getName());
        }

        System.out.println("\n");

        System.out.println("Hash + trying to duplicate + for loop");

        HashSet<Month> monthsHash = new HashSet<Month>(months);

        monthsHash.add(month1);
        monthsHash.add(month2);
        monthsHash.add(month3);
        monthsHash.add(month4);
        monthsHash.add(month5);
        monthsHash.add(month6);
        monthsHash.add(month7);
        monthsHash.add(month8);
        monthsHash.add(month9);
        monthsHash.add(month10);
        monthsHash.add(month11);
        monthsHash.add(month12);

        for (Month month : monthsHash) {
            System.out.println(month.getName());
        }

        System.out.println("\n");

        System.out.println("Hash + iterator");

        Iterator <Month> monthsIt = monthsHash.iterator();

        while(monthsIt.hasNext()) {
            System.out.println(monthsIt.next().getName());
        }

    }

}
