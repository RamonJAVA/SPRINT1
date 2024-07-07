public class NoGenericsMethod {
    Cat cat1;
    Cat cat2;
    Cat cat3;

    public NoGenericsMethod(Cat cat1, Cat cat2, Cat cat3) {
        this.cat1 = cat1;
        this.cat2 = cat2;
        this.cat3 = cat3;
    }

    @Override
    public String toString() {
        return "NoGenericsMethod{" +
                "cat1=" + cat1 +
                ", cat2=" + cat2 +
                ", cat3=" + cat3 +
                '}';
    }
}
