package Part_3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PowerfulSet {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(0);
        set2.add(1);
        set2.add(2);
        set2.add(4);

//        System.out.println(intersection(set1, set2));
//        System.out.println(union(set1, set2));
//        System.out.println(relativeComplement(set1, set2));
    }

    public static  <T> Set<T> intersection(Set<T> set1,Set<T> set2){
        set1.retainAll(set2);
        return set1;
    }

    public static <T> Set<T> union(Set<T> set1,Set<T> set2){
        Set<T> res = new TreeSet<>();
        for(T i : set1){
            res.add(i);
        }
        for (T i : set2){
            res.add(i);
        }
        return res;
    }

    public static <T> Set<T> relativeComplement(Set<T> set1,Set<T> set2){
        for(T i : set2){
            if(set1.contains(i)){
                set1.remove(i);
            }
        }
        return set1;
    }

}
