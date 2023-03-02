package Part_1;

public class Main {
    private static int x = 5;
    public static void main(String[] args) throws MyCheckedException {
        if (x < 5){
            System.out.println("Success!");
        } else {
            throw new MyCheckedException("Сработало проверяемое исключение!");
        }
    }
}
