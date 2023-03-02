package Part_3;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        openTextFile();
    }
    static void openTextFile() throws IOException {

        try{
            FileReader fr = new FileReader("src/Part_3/input.txt");
            FileWriter fw = new FileWriter("src/Part_3/output.txt", false);
            String str = "";
            Scanner sc = new Scanner(fr);

            while (sc.hasNextLine())
                str += sc.nextLine().toUpperCase() + "\n";
            fw.write(str);

            fr.close();
            fw.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
