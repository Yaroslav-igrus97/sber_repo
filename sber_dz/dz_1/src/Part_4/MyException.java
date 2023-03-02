package Part_4;

public class MyException extends Exception {
    public MyException(){
        super("Нельзя создавать инстанс MyEvenNumber c нечетным числом!");
    }
}
