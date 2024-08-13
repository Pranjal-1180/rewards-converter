import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        try{
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        System.out.println("Please enter miles value to convert to cash value: ");
        var inputValue1 = scanner.nextLine();

        double cashValue;
        int milesValue;

        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }

        try {
            milesValue = Integer.parseInt(inputValue1);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse miles value as an integer, exiting");
            return;
        }

        // Convert cash to miles
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");

         // Convert miles to cash
         System.out.println("Converting " + milesValue + " miles to cash");
         var rewardsValueFromMiles = new RewardValue(milesValue);
         System.out.println(milesValue + " miles is worth $" + rewardsValueFromMiles.getCashValue());

    }
    finally{
        scanner.close();
    }
}
}