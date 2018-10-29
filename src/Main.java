public class Main {
    public static void main(String[] args) {

        ///
        String name = "Ork";
        int attack = 10;
        int def = 15;
        ///

        Ork ork1 = new Ork();
        ork1.attack = 10;
        ork1.def = 16;
        ork1.name = "Oskar1";

        Ork ork2 = new Ork();
        ork2.attack = 20;
        ork2.def = 10;


        Person personWhoHasMyMoney = new Person();
        personWhoHasMyMoney.name = "Kamil";
        personWhoHasMyMoney.surname = "G**a";
        personWhoHasMyMoney.height = 176;

        Job someoneJob = new Job();
        someoneJob.name = "PiekarzAkrobata";
        someoneJob.salary = 14000;
        someoneJob.amountDayOfWork = 2;

        personWhoHasMyMoney.personJob = someoneJob;

        printPersonNameAndSurname(personWhoHasMyMoney);
    }

    public static void printPersonNameAndSurname(Person personAsArgument){
        System.out.println(personAsArgument.name + " " + personAsArgument.surname);
        System.out.println(personAsArgument.personJob.name);
    }
}
