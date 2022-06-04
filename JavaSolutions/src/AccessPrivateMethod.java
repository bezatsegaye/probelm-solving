import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AccessPrivateMethod {
    private void sampleMethod() {
        System.out.println("This is a Private Method");
    }

    public static void main(String[] args) throws Exception {
        Class c = Class.forName("AccessPrivateMethod");
        Object ob = c.getDeclaredConstructor().newInstance();
        Method method = ob.getClass().getDeclaredMethod("sampleMethod", null);
        method.setAccessible(true);
        method.invoke(ob,null);
    }
}
