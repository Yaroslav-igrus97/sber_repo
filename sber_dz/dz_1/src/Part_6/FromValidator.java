package Part_6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FromValidator {
    public static void checkName(String str){
        if (!(str.length() >= 2 && str.length() <= 20 && Character.isUpperCase(str.charAt(0)))){
            try {
                throw new NameException();
            } catch (NameException e) {
                e.printStackTrace();
            }
        }
    }
    public static void checkBirthdate(String str){
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        try {
            Date date = sdf.parse(str);
            Date start = sdf.parse("01.01.1900");
            Date end = new Date();
            if (!(date.getTime() > start.getTime() && date.getTime() < end.getTime())){
                throw new BirthdateException();
            }
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (BirthdateException e){
            e.printStackTrace();
        }
    }

    public static void checkGender(String str){
        boolean res = false;
        Gender[] genders = Gender.values();
        for( var i : genders){
            if (i.toString().equals(str)){
                res = true;
                break;
            }
        }
        if(!res){
            try {
                throw new GenderException();
            } catch (GenderException e) {
                e.printStackTrace();
            }
        }
    }
    public static void checkHeight(String str){
        try{
            double height = Double.parseDouble(str);
            if (height < 0){
                throw new HeightException();
            }
        } catch (HeightException e){
          e.printStackTrace();
        } catch (Exception e){
            try {
                throw new HeightException();
            } catch (HeightException ex) {
                ex.printStackTrace();
            }
        }
    }
}

class NameException extends Exception{
    public NameException(){
        super("Ошибка в имени!");
    }
}

class BirthdateException extends Exception{
    public BirthdateException(){
        super("Ошибка в дне рождения!");
    }
}

class GenderException extends Exception{
    public GenderException(){
        super("Ошибка при выборе пола!");
    }
}

class HeightException extends Exception{
    public HeightException(){
        super("Ошибка при выборе роста!");
    }
}
