import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {
        File file = new File("Lorem.txt");
        try {
            FileReader reader = new FileReader(file);
            int count = 0;
            while(reader.read()!=-1){
                count++;


            }
            System.out.println(count);
        }

        catch (FileNotFoundException e) {
            System.out.println("File not Found");
        }
        catch (IOException e){
            System.out.println("IO Exception");

        }
    }
}