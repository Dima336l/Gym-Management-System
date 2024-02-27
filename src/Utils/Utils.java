package Utils;

import Objects.MemberCreation;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Utils {
    public static String getFilePath(String str) {
        String dataFile = System.getProperty("user.dir") + File.separator + "Data" + File.separator + str;
        return dataFile;
    }

    public static ArrayList<String> readFile(String str) {
        String dataFile = getFilePath(str);
        ArrayList<String> listOfStrings = new ArrayList<>();
        try (BufferedReader bf = new BufferedReader(new FileReader(dataFile))) {
            String line = bf.readLine();
            while (line != null) {
                listOfStrings.add(line);
                line = bf.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error encountered while reading the file: " + e.getMessage());
            try {
                throw e;
            } catch (IOException ex) {
                Logger.getLogger(MemberCreation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listOfStrings;
    }
}
