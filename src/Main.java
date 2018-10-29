public class Main {
    public static void main(String[] args) {

        ///
        String name = "Ork";
        int attack = 10;
        int def = 15;
        ///



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
