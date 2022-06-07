import java.lang.reflect.Field;

public class AccessPrivateField {
    private final String name = "Tsegaye";

    public static void main(String[] args) throws Exception {
        Class c = Class.forName("AccessPrivateField");
        Object obj = c.getDeclaredConstructor().newInstance();
        Field field = obj.getClass().getDeclaredField("name");
        field.setAccessible(true);
        System.out.println(field.get(obj));
    }
}
