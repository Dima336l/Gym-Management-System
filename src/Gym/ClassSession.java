package Gym;

import java.util.Date;


public class ClassSession extends TrainingSession {
    String name;
    int limit;

    public ClassSession(String name, int limit, Date date, Gym gym, Trainer trainer) {
        super(date, gym, trainer);
        this.name = name;
        this.limit = limit;
    }
    
    
       
}
