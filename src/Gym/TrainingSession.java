package Gym;

import java.util.ArrayList;
import java.util.Date;


public abstract class TrainingSession {
    Date date;
    Gym gym;
    Trainer trainer;
    ArrayList <Member> members;

    public TrainingSession(Date date, Gym gym, Trainer trainer) {
        this.date = date;
        this.gym = gym;
        this.trainer = trainer;
        members = new ArrayList<>();
    }

   
    
    
    
    
}
    