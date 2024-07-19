import java.text.NumberFormat;
import java.util.*;

//Mortgage Calculator
public class Main {
    public static void main(String[] args) {

        int monthsInYear = 12;
        int percent = 100;

        Scanner sc = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = sc.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest=sc.nextFloat();
        float monthlyInterest = annualInterest / percent/monthsInYear;

        System.out.print("Period (years): ");
        int years = sc.nextInt();
        int numberOfPayments = years * monthsInYear;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest,numberOfPayments))/(Math.pow(1 + monthlyInterest,numberOfPayments)-1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+mortgageFormatted);
    }
}
