public class Bank {
    public static void main(String[] args) {
        Adress BillingAdress = new Adress();
        BillingAdress.city = " Zielona Góra";
        BillingAdress.street = " Różowa";
        BillingAdress.houseNumber = "15a";
        BillingAdress.lacalNumber = "";
        BillingAdress.postalCode = "65-128";

        Adress Adress = new Adress();
        Adress.city = " Zielona Góra";
        Adress.street = " Anny Jagielonki";
        Adress.houseNumber = "19b";
        Adress.lacalNumber = "1";
        Adress.postalCode = "65-001";

        Person person1 = new Person();
        person1.BillingAdress = BillingAdress;
        person1.Adress = Adress;
        person1.firstName = "Radosław";
        person1.lastName = "Pohling";
        person1.pesel = "102301204912";

        Person person2 = new Person();
        person2.BillingAdress = Adress;
        person2.Adress = Adress;
        person2.firstName = "Kamil";
        person2.lastName = "Klecha";
        person2.pesel = "102301204123";


                BankAccount account1 = new BankAccount();
                account1.owner = person1;
                account1.balance = 10_000;

                BankAccount account2 = new BankAccount();
                account2.owner = person2;
                account2.balance = 150_000;


                Credit credit1=  new Credit();
                credit1.borrwer = person1;
                credit1.cashBorrowed =10_000;
                credit1.cashReturned = 3000;
                credit1.interestRate = 0.20;
                credit1.termMonths = 60;


                Credit credit2 = new Credit();
                credit2.borrwer = person2;
                credit2.cashBorrowed =180_000;
                credit2.cashReturned = 6000;
                credit2.interestRate = 5.10;
                credit2.termMonths = 60;

                System.out.println("Osoba:");
                System.out.println(person1.firstName + " " + person1.lastName + " " + person1.pesel);
                System.out.println("posiada konto bankowe z kwotą : " + account1.balance);
                System.out.println("oraz kredyt na kwotę " + credit1.cashBorrowed);
                System.out.println("Zameldowany: ");
                System.out.println(person1.BillingAdress.city + " " + person1.BillingAdress.street + " " +
                        person1.BillingAdress.houseNumber + " " + person1.BillingAdress.lacalNumber + " " +
                        person1.BillingAdress.postalCode);
                System.out.println("Zamieszkały: ");
                System.out.println(person1.Adress.city + " " + person1.Adress.street + " " +
                        person1.Adress.houseNumber + "/" + person1.Adress.lacalNumber + " " +
                        person1.Adress.postalCode);

                        System.out.println("");


                System.out.println("Osoba:");
                System.out.println(person2.firstName + " " + person2.lastName + " " + person2.pesel);
                System.out.println("posiada konto bankowe z kwotą : " + account2.balance);
                System.out.println("oraz kredyt na kwotę " + credit2.cashBorrowed);
                System.out.println("Zameldowany: ");
                System.out.println(person2.BillingAdress.city + " " + person2.BillingAdress.street + " " +
                        person2.BillingAdress.houseNumber + "/" + person2.BillingAdress.lacalNumber + " " +
                        person2.BillingAdress.postalCode);
                System.out.println("Zamieszkały: ");
                System.out.println(person2.Adress.city + " " + person2.Adress.street + " " +
                        person2.Adress.houseNumber + "/" + person2.Adress.lacalNumber + " " +
                        person2.Adress.postalCode);


    }
}
