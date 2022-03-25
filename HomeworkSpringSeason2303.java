package homework;

import java.util.Scanner;

public class HomeworkSpringSeason2303 {
    public static void main(String[] args) {
        int month;
        int day;
        System.out.println("Enter number for month...");
        Scanner scanner = new Scanner(System.in);
        month = scanner.nextInt();
        System.out.println("Enter number for day...");
        day = scanner.nextInt();
        if ( 3 <= month && day >= 20 || 6 >= month && day <= 20){
            System.out.println("Date is between 20.03 and 20.06");
        } else {
        System.out.println( "Date is not between 20.03 and 20.06");
        }
    }
}
