package homework;

import java.util.Scanner;

public class Homework42303 {
    public static void main(String[] args) {
        int x;
        System.out.println("Input number... ");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        int y;
        System.out.println("Input number... ");
        y = scanner.nextInt();
        int z;
        System.out.println("Input number... ");
        z = scanner.nextInt();
        if (x == y && x == z) {
            System.out.println("Триъгълника е равностранен");
        } else if (x == y && x != z) {
            System.out.println("Триъгълника е равнобедрен");
        } else if (x != y && x == z) {
            System.out.println("Триъгълника е равнобедрен");
        } else if ( x != y && y == z) {
            System.out.println("Триъгълника е равнобедрен");
        } else {
            System.out.println("Триъгълника е разностранен");
        }
    }
}
