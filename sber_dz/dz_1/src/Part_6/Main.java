package Part_6;

public class Main {
    public static void main(String[] args) {
        String name = "Roman";
        String birthdate = "12.04.2001";
        String gender = "Male";
        String height = "180";

        FromValidator.checkName(name);
        FromValidator.checkBirthdate(birthdate);
        FromValidator.checkGender(gender);
        FromValidator.checkHeight(height);
    }
}
