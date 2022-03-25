package homework;

import java.util.Scanner;

public class HomeworkBMI2303 {
    public static void main(String[] args) {
        float weight;
        float height;
        System.out.println("Input your weight in kg...");
        Scanner scanner = new Scanner(System.in);
        weight = scanner.nextFloat();
        System.out.println("Input your height in meter...");
        height = scanner.nextFloat();
        double myBMI = weight / Math.pow(height, 2);
        System.out.println(" My BMI is " + myBMI);
        boolean underWeight = myBMI < 18.5;
        boolean normalWeight = 18.5 <= myBMI && myBMI <= 24.9;

        if (underWeight) {
            System.out.println("Underweight");
        } else if (normalWeight) {
            System.out.println("Normal weight");
        } else{
                System.out.println("Overweight");
            }

    }
}