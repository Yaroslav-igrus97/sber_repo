package Part_2;

public class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(){
        super("Сработало непроверяемое исключение: ArrayIndexOutOfBoundsException");
    }
}
