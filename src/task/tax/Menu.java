package task.tax;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Payment[] payments;

    public Menu() {
        scanner = new Scanner(System.in);
        payments = new Payment[100];  // ograniczenie do 100 kosztow i dochodu
    }

    private void printMenu() {
        System.out.println("1 - Dodaj platnosc");
        System.out.println("2 - Oblicz podatki :) ");
    }

    public void startMainLoop() {
        do {
            printMenu();
            parseAnswerFromUser(getAnswerFromUser());
        }while (true);
    }

    private void parseAnswerFromUser(String answerFromUser) {
        switch (answerFromUser){
            case "1": {
                addPayment();
                break;
            }
            case "2": {
                calculateTaxes();
                break;
            }
        }
    }

    private void addPayment() {
        printString("Podaj wysokosc transakcji: ");
        double transValue = Double.parseDouble(getAnswerFromUser());

        printString("Podaj wysokosc vatu: ");
        double transVat = Double.parseDouble(getAnswerFromUser());


        printString("Czy to koszt?: ");
        boolean transIsCost = Boolean.parseBoolean(getAnswerFromUser());

        printString("Nazwa: ");
        String transName = getAnswerFromUser();


        Payment payment = new Payment(transIsCost, transValue, transVat, transName);
        addPaymentToList(payment);
    }

    private void addPaymentToList(Payment payment){
        for (int i = 0; i < payments.length; i++) {
            if(payments[i] == null){
                payments[i] = payment;
                break;
            }
        }
    }

    private void calculateTaxes() {
        int sumOfCost = 0;
        int sumOfIncome = 0;
        int vatValueCost = 0;
        int vatValueIncome = 0;
        for (Payment payment : payments) {
             if(payment != null) {
                  if(payment.isCost()){
                      //Wyliczamy kwote netto z kwoty brutto
                      sumOfCost += payment.getValue() *  (1 - payment.getVat());
                      vatValueCost += payment.getValue() * (payment.getVat() / 100);
                  }else{
                      sumOfIncome += payment.getValue() *  (1 - payment.getVat());
                      vatValueCost += payment.getValue() * (payment.getVat() / 100);
                  }
             }
        }

        printString("Wartość podatku dochodowego: "  + ((sumOfIncome - sumOfCost) * 0.18));
        printString("Wartość VATU "  + (vatValueIncome - vatValueCost));
    }

    private void printString(String text) {
        System.out.println(text);
    }

    private String getAnswerFromUser() {
        return scanner.nextLine();
    }
}
