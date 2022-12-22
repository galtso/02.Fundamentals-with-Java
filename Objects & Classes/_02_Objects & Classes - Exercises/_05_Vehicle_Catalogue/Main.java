package ObjectsAndClasses._02_ObjectsAndClasses_Exercises._05_Vehicle_Catalogue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Vehicle> vehicleList = new ArrayList<>();
        String line = scan.nextLine();
        while (!line.equals("End")) {
            String[] vehicleData = line.split(" ");
            String type = vehicleData[0];
            String model = vehicleData[1];
            String color = vehicleData[2];
            int power = Integer.parseInt(vehicleData[3]);
            if (type.equals("car")) {
                vehicleList.add(new Vehicle("Car", model, color, power));
            } else if (type.equals("truck")) {
                vehicleList.add(new Vehicle("Truck", model, color, power));
            }
            line = scan.nextLine();
        }
        String model = scan.nextLine();
        while (!model.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getModel().equals(model)) {
                    System.out.println(vehicle);
                }
            }
            model = scan.nextLine();
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", calculateAverageHorsepower(vehicleList, "Car"));
        System.out.printf("Trucks have average horsepower of: %.2f.", calculateAverageHorsepower(vehicleList, "Truck"));
    }

    private static double calculateAverageHorsepower(List<Vehicle> vehicleList, String type) {
        int[] vehicleHorsePower = vehicleList.stream().filter(x -> x.getType().equals(type)).mapToInt(Vehicle::getPower).toArray();
        int sum = Arrays.stream(vehicleHorsePower).sum();
        if (vehicleHorsePower.length == 0) {
            return 0;
        } else {
            return 1.0 * sum / vehicleHorsePower.length;
        }
    }
}
