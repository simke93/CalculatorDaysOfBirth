package org.example;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

// Class which calculating age in days of one person when that person enter full birth date.
public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your date of birth (YYYY-MM-DD): ");
        String birthDateStr = scanner.nextLine();

        LocalDate birthDate = LocalDate.parse(birthDateStr);
        LocalDate currentDate = LocalDate.now();

        long totalDays = ChronoUnit.DAYS.between(birthDate, currentDate);

        if (totalDays < 0) {
            System.out.println("Error: Birth date can not be in future");
        } else {
            System.out.println("Total age in days: " + totalDays);
        }
        scanner.close();
    }

}
