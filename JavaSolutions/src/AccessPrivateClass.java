import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AccessPrivateClass {
    private final String name = "Tsegaye";

    private void getName(String address) {
        System.out.println(address);
    }

    public static void main (String[] args) throws Exception {
        Class c = Class.forName("AccessPrivateClass");
        Object obj = c.getConstructor().newInstance();
        Method method = obj.getClass().getDeclaredMethod("getName", String.class);
        method.setAccessible(true);
        method.invoke(obj, "100 N st");

        Field field = obj.getClass().getDeclaredField("name");
        field.setAccessible(true);
        System.out.println((String)field.get(obj));
    }
}
