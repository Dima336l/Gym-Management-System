package Gym;

import java.util.ArrayList;

public class Gym {

    private final int gymID;
    private final String name;
    private ArrayList<TrainingSession> sessions;
    private ArrayList<Member> members;
    private ArrayList<Trainer> trainers;

    public Gym(String name, int gymID) {
        this.name = name;
        this.gymID = gymID;
        this.sessions = new ArrayList<>();
        this.members = new ArrayList<>();
        this.trainers = new ArrayList<>();
    }
    
   
    public void addMember(Member m) {
        members.add(m);
    }

    public void removeMember(Member m) {
        members.remove(m);
    }

    public void addSesion(TrainingSession s) {
        sessions.add(s);
    }

    public void removeSession(TrainingSession s) {
        sessions.remove(s);
    }

    public String getName() {
        return name;
    }

    public int getGymID() {
        return gymID;
    }
    
    

}
