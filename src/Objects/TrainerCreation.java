package Objects;

import Gym.Gym;
import Gym.Trainer;
import static Utils.Utils.readFile;
import java.util.ArrayList;

public final class TrainerCreation {

    private static TrainerCreation istance;
    private final ArrayList<Trainer> trainers;

    private TrainerCreation() {
        trainers = new ArrayList<>();
        createTrainers();
    }

    public static TrainerCreation getIstance() {
        if (istance == null) {
            istance = new TrainerCreation();
        }
        return istance;
    }

    public Trainer createTrainer(String str) {
        Gym gymAssigned = null;
        String[] fields = str.split(",");
        for (Gym gym : GymCreation.gyms) {
            if (Integer.valueOf(fields[0]) == gym.getGymID()) {
                gymAssigned = gym;
            }
        }
        return new Trainer(Integer.valueOf(fields[0]), fields[1], gymAssigned);
    }

    public void createTrainers() {
        ArrayList<String> trainerData = readFile("Trainers.txt");
        trainerData.forEach(str -> {
            System.out.println(str);
        });
        for (int i = 0; i < trainerData.size(); i++) {
            System.out.println("XD");
            System.out.println(createTrainer(trainerData.get(i)).getName());
            trainers.add(createTrainer(trainerData.get(i)));
            
        }
    }

    public ArrayList<Trainer> getTrainers() {
        return trainers;
    }

    public static void main(String[] args) {
        TrainerCreation trainerObj = TrainerCreation.getIstance();
        //ArrayList<Trainer> trainersData = trainerObj.getTrainers();
        ///for (int i = 0; i < trainersData.size(); i++) {
        //   System.out.println(trainersData.get(i));
        // }
    }

}
