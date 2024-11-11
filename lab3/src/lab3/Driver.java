package lab3;

import java.util.Random;

public class Driver {
    public static void main(String[]args) {
        final int VALUES = 10; // Number of random values to generate

        // Create a object of the stats class to store the random values into it 
        Stats stats = new Stats(VALUES);
        Random random = new Random();

        // Add random values between 0 and 99 to the stats object created above
        for (int i = 0; i < VALUES; i++) {
            stats.addValue(random.nextInt(100));
        }

        // Display the stored numbers
        System.out.println("Numbers stored: ");
        System.out.println(stats);

        // Display the statistical information
        System.out.println("Average = " + stats.getAverage());
        System.out.println("Count (Capacity) = " + stats.getCapacity());
        System.out.println("Total = " + stats.getTotal());
        System.out.println("Minimum value = " + stats.getMinValue());
        System.out.println("Maximum value = " + stats.getMaxValue());
    }
}
