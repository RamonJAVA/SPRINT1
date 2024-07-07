public class Cat {
    private String name;
    private String fur;

    public Cat(String name, String fur) {
        this.name = name;
        this.fur = fur;
    }

    public String getName() {
        return name;
    }

    public String getFur() {
        return fur;
    }

    public static void meow(){
        System.out.println("Meow!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", fur='" + fur + '\'' +
                '}';
    }
}
