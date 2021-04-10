package com.sda.calc.triangles;

import java.util.Scanner;

public class NumberLoader {

    public static int loadFromUser() throws InvalidInputException {
        try {
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            int number = Integer.parseInt(text);
            return number;
        } catch (NumberFormatException exception) {
            throw new InvalidInputException();
        } finally {
            System.out.println("Czyszczę");
        }

    }
}
