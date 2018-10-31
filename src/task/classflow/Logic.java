package task.classflow;

public class Logic {
    private PhoneBook phoneBook;

    public Logic(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;


    }

    public void someonePressOne() {
        System.out.println(phoneBook.getNumber());
    }
}
