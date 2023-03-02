package Part_2;

import Part_1.IsLike;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        TestClass t = new TestClass();
        reflectionTest(t);
    }


    private static void reflectionTest(TestClass t) {
        Class cl = t.getClass();
        if (cl.isAnnotationPresent(IsLike.class)) {
                IsLike il = (IsLike) cl.getAnnotation(IsLike.class);
                System.out.println("Значение в IsLike: " + il.myBool());
        } else{
            System.out.println("Аннотации IsLike нет на переданном классе!");
        }
    }
}

@IsLike(myBool = true)
class TestClass{
}
