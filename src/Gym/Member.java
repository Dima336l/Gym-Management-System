package Gym;


public class Member {
    private String name;
    private String number;
    private Gym gym;
    private Trainer trainer;

    public Member(String name, String number, Gym gym) {
        this.name = name;
        this.number = number;
        this.gym = gym;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public Gym getGym() {
        return gym;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setGym(Gym gym) {
        this.gym = gym;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
    
   
    
    
}
