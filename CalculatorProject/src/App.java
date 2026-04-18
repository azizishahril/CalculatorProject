import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //declare fix variable
        final byte month_in_year = 12;
        final byte percent = 100;

        System.out.println("personal loan calculator");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal : ");
        double principal = scanner.nextDouble();
        System.out.print("Annual Interest Rate : ");
        double annual_interest_rate = scanner.nextDouble();
        System.out.print("Period(Years) : ");
        int years = scanner.nextInt();
        double monthly_interest = annual_interest_rate/month_in_year/percent;
        int month_payment = years * month_in_year;
        double factor = Math.pow((1+monthly_interest), month_payment);
        double Mortgage = principal * ( monthly_interest*factor ) / (factor-1);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(Mortgage);
        System.out.print("Mortgage : " + result );
        scanner.close();
        
    }
}
