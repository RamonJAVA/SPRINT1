public class Smartphone extends Phone implements Clock, Camera{

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public String takePicture() {
        return "Picture taken.";
    }

    @Override
    public String alarm() {
        return "DING DING DING DING";
    }
}
