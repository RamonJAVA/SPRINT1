public class MethodsUndefined {

    public static <T> void methodUndefined(T... args) {
        for (T genericData : args) {
            System.out.println(genericData);
        }

    }
}