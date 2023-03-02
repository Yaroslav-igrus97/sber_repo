package Part_4;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Class> allInt = new HashSet<>();
        Test ts = new Test();

        Class cl = ts.getClass();
        Class superCl = cl.getSuperclass();
        Class[] interfaces = cl.getInterfaces(); //интерфейсы класса
        Class[] superClInterfaces = superCl.getInterfaces(); //интерфейсы класса-родителя

        for(var i : interfaces){
            allInt.add(i);
            Class[] superInterfaces = i.getInterfaces(); //интерфейсы интерфейсов-родителей
            for(var j : superInterfaces){
                allInt.add(j);
            }
        }
        for(var i : superClInterfaces){
            allInt.add(i);
        }
        System.out.println(allInt);
    }
}

class Test extends Test2 implements MyInterface, MyInterface2 {}

class Test2 implements MyInterface2{}
