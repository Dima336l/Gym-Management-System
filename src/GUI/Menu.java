package GUI;

public class Menu {

    Logic logic;

    public Menu() {
        this.logic = new Logic();
    }

    public void displayOptions() {
        System.out.println("1.Book personal training session for member.");
        System.out.println("2.Book member on class session.");
        System.out.println("3.List trainer's sessions.");
        System.out.println("4.List member bookings.");
    }

    public void handleFirstChoice () {
        logic.handleFirstChoice();
    }
    
    public void handleSecondChoice () {
        logic.handleSecondChoice();
    }
    
    public void handleThirdChoice () {
        logic.handleThirdChoice();
    }
    
    public void handleFourthChoice () {
        logic.handleFourthChoice();
    }
    
    public void handleDefault () {
        logic.handleDefault();
    }
    
    public void handleOption(int choice) {
        final int ONE = 1;
        final int TWO = 2;
        final int THREE = 3;
        final int FOUR = 4;
        switch (choice) {
            case ONE:
                handleFirstChoice();
                break;
            case TWO:
                handleSecondChoice();
                break;
            case THREE:
                handleThirdChoice();
                break;
            case FOUR:
                handleFourthChoice();
                break;
            default:
                handleDefault();
        }
    }
}
