import javax.lang.model.type.PrimitiveType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ProtectingPrivateClassFromReflection extends SecurityManager {
    private final String name = "Tsegaye";

    private int getSalary(Integer address) {
        return address;
    }

    @Override
    public void checkPackageAccess(String pkg){
        super.checkPackageAccess(pkg);
        // don't allow the use of the reflection package
        if(pkg.equals("java.lang.reflect")){
            throw new SecurityException("Reflection is not allowed!");
        }
    }
}
