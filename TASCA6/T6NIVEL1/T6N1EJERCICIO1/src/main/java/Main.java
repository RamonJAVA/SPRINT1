public class Main {
    public static void main(String[] args){

        Cat cat1 = new Cat("Garfield", "Orange");
        Cat cat2= new Cat("Felix", "Black");
        Cat cat3 = new Cat("HelloKitty", "White");

        NoGenericsMethod ngm1 = new NoGenericsMethod(cat1, cat2, cat3);
        NoGenericsMethod ngm2 = new NoGenericsMethod(cat3, cat1, cat2);
        NoGenericsMethod ngm3 = new NoGenericsMethod(cat2, cat3, cat1);

        System.out.println(ngm1);
        System.out.println(ngm2);
        System.out.println(ngm3);
    }
}
