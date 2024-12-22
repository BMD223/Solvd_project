import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("java.util.ArrayList");

            int classModifiers = clazz.getModifiers();
            System.out.println("Class Modifiers: " + Modifier.toString(classModifiers));


            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("Field: " + field.getName() + ", Type: " + field.getType() + ", Modifiers: " + Modifier.toString(field.getModifiers()));
            }

            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println("Constructor: " + constructor.getName() + ", Parameter Count: " + constructor.getParameterCount());
            }
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("Method: " + method.getName() + ", Return Type: " + method.getReturnType() + ", Modifiers: " + Modifier.toString(method.getModifiers()));
            }


            Constructor<?> constructor = clazz.getConstructor();
            Object instance = constructor.newInstance();


            Method addMethod = clazz.getMethod("add", Object.class);
            addMethod.invoke(instance, "Hello Reflection");
            System.out.println("Instance: " + instance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}