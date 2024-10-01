public class Main {
    public static void main(String[] args) {
        double creditBalance = 5000;
        final double INTEREST_RATE = 0.17;
        double monthlyInterest = 0;

        monthlyInterest = creditBalance * INTEREST_RATE;
        System.out.println("Your month one interest is: " + monthlyInterest);
        monthlyInterest = creditBalance + monthlyInterest;
        monthlyInterest = monthlyInterest * INTEREST_RATE;
        System.out.println("Your month two balance is: " + monthlyInterest);
        
    }
}