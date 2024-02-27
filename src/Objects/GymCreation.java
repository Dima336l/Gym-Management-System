package Objects;

import Gym.Gym;
import static Utils.Utils.readFile;
import java.util.ArrayList;


public final class GymCreation {

    static ArrayList<Gym> gyms;

    public GymCreation() {
        gyms = new ArrayList<>();
        createGyms();
    }

    
    
     public ArrayList<Gym> getGyms() {
        return gyms;
    }

    public Gym createGym(String str) {
        String[] fields = str.split(",");
        return new Gym(fields[1], Integer.valueOf(fields[0]));
    }

    public void createGyms() {
        ArrayList<String> gymsData = readFile("Gyms.txt");
        for (int i = 1; i < gymsData.size(); i++) {
            gyms.add(createGym(gymsData.get(i)));
        }
    }

    public static void main(String[] args) {
        GymCreation gyms = new GymCreation();
        ArrayList<Gym> gymList = gyms.getGyms();
        for (Gym gym : gymList) {
            System.out.println(gym.getGymID());
        }
    }

   

}
