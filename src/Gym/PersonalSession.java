package Gym;

import java.util.Date;


public class PersonalSession extends TrainingSession {
    int duration;

    public PersonalSession(int duration, Date date, Gym gym, Trainer trainer) {
        super(date, gym, trainer);
        this.duration = duration;
    }

    
    
    
}
