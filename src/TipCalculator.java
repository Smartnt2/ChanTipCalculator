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

        System.out.print("Enter tax percentage (do not include % symbol): ");
        int taxPercentage = scan.nextInt();
        scan.nextLine();

        while (true) {
            System.out.print("Enter a cost in dollars and cents (-1 to end): ");
            cost = scan.nextDouble();
            if (cost == -1) break;
            totalBill += cost;
        }
        double totalTip = (totalBill * (tipPercentage / 100.0));
        totalTip = Math.round(totalTip * 100.0) / 100.0;

        double totalTax = (totalBill * (taxPercentage / 100.0));
        totalTax = Math.round(totalTax * 100.0) / 100.0;

        double totalAmount = (totalBill + totalTip + totalTax);

        double costPerPerson = (totalBill / numParty);
        costPerPerson = Math.round(costPerPerson * 100.0) / 100.0;

        double tipPerPerson = (totalTip / numParty);
        tipPerPerson = Math.round(tipPerPerson * 100.0) / 100.0;

        double taxPerPerson = (totalTax / numParty);
        taxPerPerson = Math.round(taxPerPerson * 100.0) / 100.0;

        double totalCostPerPerson = (costPerPerson + tipPerPerson);

        System.out.println("Total bill before tip: $" + totalBill);
        System.out.println("Total percentage: %" + tipPercentage);
        System.out.println("Total tip: $" + totalTip);
        System.out.println("Total tax: $" + totalTax);
        System.out.println("Total bill with tip and tax: $" + totalAmount);
        System.out.println("Per person cost before tip and tax: $" + costPerPerson);
        System.out.println("Tip per person: $" + tipPerPerson);
        System.out.println("Tax per person: $" + taxPerPerson);
        System.out.println("Total cost per person: $" + totalCostPerPerson);

    }
}
