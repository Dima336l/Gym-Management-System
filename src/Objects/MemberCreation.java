package Objects;

import Gym.Member;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MemberCreation {

    public static String getFilePath() {
        String dataFile = System.getProperty("user.dir") + File.separator + "Data" + File.separator + "Members.txt";
        return dataFile;
    }

    public static ArrayList<String> readFile() {
        String dataFile = getFilePath();
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

    public static Member createMember(String str) {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(readFile());
    }
}
