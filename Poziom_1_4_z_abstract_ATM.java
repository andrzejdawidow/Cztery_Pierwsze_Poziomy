abstract class ATM {
    abstract protected void readingRequestForPayment();
    abstract protected void checkTheAccountBalance();
    abstract protected void confirmationOfTheWithdrawalOption();
    
    private void enterYourCard() {
        System.out.println("Wprowadz karte");
    }
    private void enterYourPIN() {
        System.out.println("Podaj PIN");
    }
    private void enterYourAmount() {
        System.out.println("Wprowadz kwote");
    }
    private void withdrawCash() {
        System.out.println("Wyplacam kase");
    }
    private void thankYouForUsingTheBankServices() {
        System.out.println("Dzieki, ze wpadles");

    }
    public void run() {
        this.enterYourCard();
        this.enterYourPIN();
        this.readingRequestForPayment();
        this.enterYourAmount();  
        this.checkTheAccountBalance();
        this.confirmationOfTheWithdrawalOption();
        this.withdrawCash();
        this.thankYouForUsingTheBankServices();
    }
}
class Runner extends ATM {
    protected void readingRequestForPayment() {
        System.out.println("Wyplac mi kaske");
    }
        protected void checkTheAccountBalance() {
            System.out.println("Sprawdzam stan konta");
    }
    protected void confirmationOfTheWithdrawalOption() {
        System.out.println("Potwierdzam mozliwosc wyplaty kaski");
    }
}
class Application {
    public static void main(String args[]) {
        Runner runner = new Runner();
        runner.run();
    }
}