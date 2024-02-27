package Gym;

import java.util.ArrayList;

public class Gym {

    private String name;
    ArrayList<TrainingSession> sessions;
    ArrayList<Member> members;

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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
