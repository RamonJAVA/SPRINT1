public class Main {

    public static void main(String[] args) {

        Car car1 = new Car ("Seat", "Berlina", 215);
        Car car2 = new Car ("Seat", "Estate", 195);
        Car car3 = new Car ("Seat", "Coupe", 400);

        System.out.println("Start the race"+"\n");

        System.out.println(car1+" "+car1.accelerate());
        System.out.println(car2+" "+car1.accelerate());
        System.out.println(car3+" "+car1.accelerate());

        System.out.println("\n");

        System.out.println(Car.brake());

    }

}