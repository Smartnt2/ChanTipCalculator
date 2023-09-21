import java.util.Scanner;
import java.lang.Math;

public class TipCalculator {
    public static void main(String[] args) {
        double totalBill = 0;
        double cost;
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Tip Calculator");
        System.out.print("Enter number of people in your group: ");
        int numParty = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter tip percentage (do not include % symbol): ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();

        while (true) {
            System.out.print("Enter a cost in dollars and cents (-1 to end): ");
            cost = scan.nextDouble();
            if (cost == -1) break;
            totalBill += cost;
        }
        double totalTip = (totalBill * (tipPercentage / 100.0));
        totalTip = Math.round(totalTip * 100.0) / 100.0;
        double totalBillWithTip = (totalBill + totalTip);
        double costPerPerson = (totalBill / numParty);
        costPerPerson = Math.round(costPerPerson * 100.0) / 100.0;
        double tipPerPerson = (totalTip / numParty);
        tipPerPerson = Math.round(tipPerPerson * 100.0) / 100.0;
        double totalCostPerPerson = (costPerPerson + tipPerPerson);

        System.out.println("Total bill before tip: $" + totalBill);
        System.out.println("Total percentage: %" + tipPercentage);
        System.out.println("Total tip: $" + totalTip);
        System.out.println("Total bill with tip: $" + totalBillWithTip);
        System.out.println("Per person cost before tip: $" + costPerPerson);
        System.out.println("Tip per person: $" + tipPerPerson);
        System.out.println("Total cost per person: $" + totalCostPerPerson);

    }
}
