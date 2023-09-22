import java.util.Scanner;
import java.lang.Math;

public class TipCalculator {
    public static void main(String[] args) {
        double totalBill = 0;
        double cost;
        double totalTax = 0;
        double totalTip;
        double totalAmount;
        double totalCostPerPerson;
        double costPerPerson;
        double taxPerPerson = 0;
        double tipPerPerson;
        int taxPercentage = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Tip Calculator");
        System.out.print("Enter number of people in your group: ");
        int numParty = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter tip percentage (do not include % symbol): ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();

        System.out.print("Would you like to include tax? (y/n): ");
        String includeTax = scan.nextLine();

        if (includeTax.equals("y")) {
            System.out.print("Enter tax percentage (do not include % symbol): ");
            taxPercentage = scan.nextInt();
            scan.nextLine();
        }

        while (true) {
            System.out.print("Enter a cost in dollars and cents (-1 to end): ");
            cost = scan.nextDouble();
            if (cost == -1) break;
            totalBill += cost;
        }

        if (includeTax.equals("y")) {
            totalTax = (totalBill * (taxPercentage / 100.0));
            totalTax = Math.round(totalTax * 100.0) / 100.0;
            totalTip = (totalBill * (tipPercentage / 100.0));
            totalTip = Math.round(totalTip * 100.0) / 100.0;
            totalAmount = (totalBill + totalTip + totalTax);

            taxPerPerson = (totalTax / numParty);
            taxPerPerson = Math.round(taxPerPerson * 100.0) / 100.0;

            costPerPerson = (totalBill / numParty);
            costPerPerson = Math.round(costPerPerson * 100.0) / 100.0;

            tipPerPerson = (totalTip / numParty);
            tipPerPerson = Math.round(tipPerPerson * 100.0) / 100.0;

            totalCostPerPerson = (totalAmount / numParty);
            totalCostPerPerson = Math.round(totalCostPerPerson * 100.0) / 100.0;

        } else {
            totalTip = (totalBill * (tipPercentage / 100.0));
            totalTip = Math.round(totalTip * 100.0) / 100.0;
            totalAmount = (totalBill + totalTip);

            costPerPerson = (totalBill / numParty);
            costPerPerson = Math.round(costPerPerson * 100.0) / 100.0;

            tipPerPerson = (totalTip / numParty);
            tipPerPerson = Math.round(tipPerPerson * 100.0) / 100.0;

            totalCostPerPerson = (totalAmount / numParty);
            totalCostPerPerson = Math.round(totalCostPerPerson * 100.0) / 100.0;
        }

        System.out.println(" ");
        System.out.println("Total bill before tip: $" + totalBill);
        System.out.println("Total percentage: " + tipPercentage + "%");
        System.out.println("Total tip: $" + totalTip);

        if (includeTax.equals("y")) {
            System.out.println("Total tax: $" + totalTax);
            System.out.println("Total bill with tip and tax: $" + totalAmount);
            System.out.println("Per person cost before tip and tax: $" + costPerPerson);
        } else {
            System.out.println("Total bill with tip: $" + totalAmount);
            System.out.println("Per person cost before tip: $" + costPerPerson);
        }

        System.out.println("Tip per person: $" + tipPerPerson);

        if (includeTax.equals("y")) {
            System.out.println("Tax per person: $" + taxPerPerson);
        }

        System.out.println("Total cost per person: $" + totalCostPerPerson);

    }
}
