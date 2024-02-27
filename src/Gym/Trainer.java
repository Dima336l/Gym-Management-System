package Gym;

import java.util.ArrayList;

public class Trainer {

    private String name;
    private Gym gym;
    private ArrayList<Member> clients;
    private ArrayList<TrainingSession> sessions;
    
    public Trainer(String name, Gym gym) {
        this.name = name;
        this.gym = gym;
        clients = new ArrayList<>();
        sessions = new ArrayList<>();
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
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setGym(Gym gym) {
        this.gym = gym;
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
    
}
