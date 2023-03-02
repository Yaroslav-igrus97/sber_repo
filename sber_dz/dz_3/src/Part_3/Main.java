package Part_3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        APrinter ap = new APrinter();
        Class cl = ap.getClass();
        try {
            Method m = cl.getDeclaredMethod("print", new Class[]{int.class});
            m.setAccessible(true);
            m.invoke(ap, 13);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
