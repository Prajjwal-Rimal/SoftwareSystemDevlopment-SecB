package lab3;

import java.util.Arrays;

public class Stats {
	private int[] numbers; // Array of integers
    private int count; // counting how many values are added 

    /**
     * Constructor to initialize the stats
     * 
     * @param maximum number of integers in stats
     */
    public Stats(int capacity) {
        numbers = new int[capacity];
        count = 0;
    }

    /**
     * Adds a new integer value to the numbers array.
     * 
     * @param value the integer value to be added
     */
    public void addValue(int value) {
        numbers[count] = value; // Store value at current index
        count++; // Increment the count
    }

    /**
     * shows the total number of elements that can be stored.
     * 
     * @return the capacity of the numbers array
     */
    public int getCapacity() {
        return numbers.length;
    }

    /**
     * returns maximum value in the numbers array.
     * 
     * @return the maximum value in the array
     */
    public int getMaxValue() {
        int max = numbers[0]; // Assume first element is the largest
        for (int i = 1; i < count; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if current element is larger
            }
        }
        return max;
    }

    /**
     * returns the minimum value in the numbers array.
     * 
     * @return the minimum value in the array
     */
    public int getMinValue() {
        int min = numbers[0]; // Assume first element is the smallest
        for (int i = 1; i < count; i++) {
            if (numbers[i] < min) {
                min = numbers[i]; // Update min if current element is smaller
            }
        }
        return min;
    }

    /**
     * Calculates and returns the sum of all values in the array.
     * 
     * @return the total sum of values
     */
    public int getTotal() {
        int total = 0;
        // Sum all values in the array
        for (int i = 0; i < count; i++) {
            total += numbers[i];
        }
        return total;
    }

    /**
     * Calculates and returns the averageof values in the array.
     * 
     * @return the average of the values as a double
     */
    public double getAverage() {
        int sum = 0;
        // Sum all values in the array
        for (int i = 0; i < count; i++) {
            sum += numbers[i];
        }
        return (double) sum / count; // Calculate the average
    }

    /**
     * Returns a string of the numbers array.
     * 
     * @return a string of elements in the array
     */
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(numbers, count));
    }
}

