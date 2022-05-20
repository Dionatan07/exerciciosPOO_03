package entities;

public class FuelPump {

    private String fuelType;
    private double valueLiter;
    private double amountFuel;

    private double totalLiters;
    private double totalValue;


    public FuelPump(double valueLiter, double amountFuel) {
        this.valueLiter = valueLiter;
        this.amountFuel = amountFuel;
    }

    public FuelPump(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getTotalLiters() {
        return totalLiters;
    }

    public double getTotalValue() {
        return totalValue;
    }


    public String getFuelType() {
        return fuelType;
    }

    public double getValueLiter() {
        return valueLiter;
    }

    public double getAmountFuel() {
        return amountFuel;

    }

    public void fuellingValue(double totalValue) {
        totalLiters = totalValue / valueLiter;
        amountFuel -= totalLiters;
    }

    public void fuellingLiter(double totalLiters) {
        totalValue = totalLiters * valueLiter;
        amountFuel -= totalLiters;
    }

    public void changeValueFuel(double newValue) {
        valueLiter = newValue;
    }

    public void changeAmountFuel(double newValue) {
        amountFuel = newValue;
    }


}
