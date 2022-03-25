package homework;

import java.util.Scanner;

public class Homework32303 {
    public static void main(String[] args) {
        int numA;
        System.out.println("Въведете число ");
        Scanner scanner = new Scanner(System.in);
        numA = scanner.nextInt();
        int  numB = numA % 2;
        if (numB == 0) {
            System.out.println("четно число");
        } else {
            System.out.println("нечетно число");
        }
    }
}
