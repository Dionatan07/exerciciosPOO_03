package application;

import entities.FuelPump;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner key = new Scanner(System.in);

        System.out.print("Enter value fuel: ");
        double valueLiter = key.nextDouble();

        System.out.print("Enter amount fuel: ");
        double amountFuel = key.nextDouble();

        FuelPump fuelPump = new FuelPump(valueLiter, amountFuel);

        System.out.println();
        System.out.println("Value fuel per litre: $" + String.format("%.2f", fuelPump.getValueLiter()));
        System.out.println("Total fuel: " + String.format("%.2f", fuelPump.getAmountFuel()) + " liters");
        System.out.println();

        System.out.println("1) Fuelling");
        System.out.println("2) Change Value Fuel per Litre");
        System.out.println("3) Change total Fuel");
        System.out.println("4) Exit");
        System.out.print("Enter option: ");
        int response = key.nextInt();
        System.out.println();

        while (response != 4) {

            if (response == 1) {


                System.out.println("Enter type fuel: ");
                System.out.println("1) Gasoline");
                System.out.println("2) Alcohol");
                System.out.println("3) Diesel");
                System.out.print("Enter option: ");
                int response1 = key.nextInt();

                if (response1 == 1) {
                    String fuelType = "Gasoline";
                    fuelPump.setFuelType(fuelType);
                } else if (response1 == 2) {
                    String fuelType = "Alcohol";
                    fuelPump.setFuelType(fuelType);
                } else if (response1 == 3) {
                    String fuelType = "Diesel";
                    fuelPump.setFuelType(fuelType);
                }

                if (response == 1) {
                    System.out.println();
                    System.out.println("1) Fuelling Value");
                    System.out.println("2) Fuelling Liter");
                    System.out.print("Enter option: ");
                    int response2 = key.nextInt();
                    if (response2 == 1) {
                        System.out.println();
                        System.out.print("Enter value Fuel: ");
                        double totalValue = key.nextDouble();

                        fuelPump.fuellingValue(totalValue);


                        System.out.println();
                        System.out.println("--------------------");
                        System.out.println("DONE!");
                        System.out.println("--------------------");
                        System.out.println(fuelPump.getFuelType());
                        System.out.println("Total liters: " + String.format("%.2f", fuelPump.getTotalLiters()));
                        System.out.println("Amount total Fuel: " + String.format("%.2f", fuelPump.getAmountFuel()));
                        System.out.println();
                        fuelPump.fuellingValue(0);


                    } else if (response2 == 2) {
                        System.out.println();
                        System.out.print("Enter total Liters: ");
                        double totalLiters = key.nextDouble();
                        fuelPump.fuellingLiter(totalLiters);

                        System.out.println();
                        System.out.println("--------------------");
                        System.out.println("DONE!");
                        System.out.println("--------------------");
                        System.out.println(fuelPump.getFuelType());
                        System.out.println("Value total $: " + String.format("%.2f", fuelPump.getTotalValue()));
                        System.out.println("Amount total Fuel: " + String.format("%.2f", fuelPump.getAmountFuel()));
                        System.out.println();
                        fuelPump.fuellingLiter(0);

                    }


                }
            } else if (response == 2) {
                System.out.print("Enter new value for fuel: ");
                double newValue = key.nextDouble();
                fuelPump.changeValueFuel(newValue);

                System.out.println();
                System.out.println("-----------------------------");
                System.out.println("DONE! New Value is $" + String.format("%.2f", fuelPump.getValueLiter()));
                System.out.println("-----------------------------");
                System.out.println();


            } else if (response == 3) {
                System.out.print("Enter new amount total for fuel: ");
                double newValue = key.nextDouble();
                fuelPump.changeAmountFuel(newValue);

                System.out.println();
                System.out.println("-----------------------------");
                System.out.println("DONE! New Amount is " + String.format("%.2f", fuelPump.getAmountFuel()));
                System.out.println("-----------------------------");
                System.out.println();


            } else {
                System.out.println("-----------------------------");
                System.out.println("Invalid Option");
                System.out.println("-----------------------------");
                System.out.println();
            }


            System.out.println("1) Fuelling");
            System.out.println("2) Change Value Fuel per Litre");
            System.out.println("3) Change total Fuel");
            System.out.println("4) Exit");
            System.out.print("Enter option: ");
            response = key.nextInt();
            System.out.println();

        }

    }


}

