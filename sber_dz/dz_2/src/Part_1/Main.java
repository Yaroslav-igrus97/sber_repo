package Part_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("aa");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("aa");

        System.out.println(getUnicEl(list));
    }

    public static <T> ArrayList<T> getUnicEl(ArrayList<T> list){
        ArrayList<T> unicList = new ArrayList<>();
        for(T val : list){
            if(!unicList.contains(val))
                unicList.add(val);
        }
        return unicList;
    }
}
