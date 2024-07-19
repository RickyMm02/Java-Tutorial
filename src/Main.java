import java.text.NumberFormat;
import java.util.*;

//Mortgage Calculator
public class Main {
    public static void main(String[] args) {

        int monthsInYear = 12;
        int percent = 100;

        int principal;
        float monthlyInterest;
        int numberOfPayments;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Principal: ");
            principal = sc.nextInt();
            if (principal >= 1000 && principal <= 1_000_000){
                break;
            }
            System.out.println("Please enter a principal between $1k and $1M");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest=sc.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30){
                monthlyInterest = annualInterest / percent/monthsInYear;
                break;
            }
            System.out.println("Please enter an annual interest rate between 1 and 30");

        }

        while (true) {
            System.out.print("Period (years): ");
            int years = sc.nextInt();
            if (years >= 1 && years <= 20){
                numberOfPayments = years * monthsInYear;
                break;
            }
            System.out.println("Enter a value between 1 and 20");
        }

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest,numberOfPayments))/(Math.pow(1 + monthlyInterest,numberOfPayments)-1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+mortgageFormatted);
    }
}
