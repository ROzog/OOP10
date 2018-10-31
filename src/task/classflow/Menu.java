package task.classflow;

public class Menu {
    private PhoneBook phoneBook;
    private Logic logic;
    private int alejaja;

    public Menu() {
        phoneBook = new PhoneBook();
       logic = new Logic(phoneBook);
    }

    public void printMenu(){

    }

    public void changeContact(String s){
    }
}
