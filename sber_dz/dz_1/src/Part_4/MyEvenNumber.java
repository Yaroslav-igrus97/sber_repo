package Part_4;

public class MyEvenNumber {
    int n;

    MyEvenNumber(int n) throws MyException {
        if (n % 2 == 0)
            this.n = n;
        else {
            throw new MyException();
        }
    }

}
