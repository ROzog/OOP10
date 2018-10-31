package task.classflow;

public class Menu {
    private PhoneBook phoneBook;
    private Logic logic;
    public Menu() {
         phoneBook = new PhoneBook();
        logic = new Logic(phoneBook);
    }

    public void printMenu(){
        if(ktos wybral opcje 1){
            logic.someonePressOne();
        }
    }

    public void changeContact(String s){
        phoneBook.setValue(s);
    }
}
