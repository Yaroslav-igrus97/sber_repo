package Part_2;

public class Main {
    static int[] arr = new int[]{1,2,3,4};

    public static void main (String[] args) throws MyUncheckedException {
        try{
            test();
        } catch (RuntimeException e){
            throw new MyUncheckedException();
        }
    }

    static void test(){
        System.out.println(arr[arr.length + 1]);
    }
}
