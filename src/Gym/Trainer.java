package Gym;

import java.util.ArrayList;

public class Trainer {

    private final int trainerID;
    private final String name;
    private final Gym gym;
    private ArrayList<Member> clients;
    private ArrayList<TrainingSession> sessions;
    
    public Trainer(int trainerID, String name, Gym gym) {
        this.trainerID = trainerID;
        this.name = name;
        this.gym = gym;
        clients = new ArrayList<>();
        sessions = new ArrayList<>();
    }
    
    
     public int getTrainerID() {
        return trainerID;
    }
    
    public String getName() {
        return name;
    }
    
    public Gym getGym() {
        return gym;
    }
    
    public ArrayList<Member> getClients() {
        return clients;
    }
    
    public ArrayList<TrainingSession> getSessions() {
        return sessions;
    }
    
    public void addMember(Member m) {
        clients.add(m);
    }
    
    public void removeMember(Member m) {
        clients.remove(m);
    }
    
    public void addSesion(TrainingSession s) {
        sessions.add(s);
    }
    
    public void removeSession(TrainingSession s) {
        sessions.remove(s);
    }

    @Override
    public String toString() {
        return "\nPersonal Trainer Info:" + "\nID: " + this.trainerID + "\nName: " + this.name + "\nGym: " + this.gym.getName();
    }

}
