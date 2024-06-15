package Chapter5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler{
    public ArrayList<Double> readValues(String filename){
        ArrayList<Double> values = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(filename))){
            while(sc.hasNext()){
                if (sc.hasNextDouble()){
                    values.add(sc.nextDouble());
                }else {
                    throw new NumberFormatException("File contains non-floating-point values");
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        return values;
    }
}
