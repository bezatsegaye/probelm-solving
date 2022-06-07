import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ProtectionFromReflexive {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("ProtectingPrivateClassFromReflection");
        Object obj = c.getConstructor().newInstance();
        Method method = obj.getClass().getDeclaredMethod("getSalary", Integer.class);
        method.setAccessible(true);
        int salary = (Integer) method.invoke(obj, 1234);
        System.out.println(salary);

        Field field = obj.getClass().getDeclaredField("name");
        field.setAccessible(true);
        System.out.println(field.get(obj));
    }
}
