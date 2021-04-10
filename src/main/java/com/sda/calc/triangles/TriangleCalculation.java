package com.sda.calc.triangles;

import java.util.Scanner;

public class TriangleCalculation {

    static int calculateTriangleCircuit(int x, int y, int z) throws CannotBuildTriangleException {
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        int z = scanner.nextInt();

            if (x + y > z && x + z > y && y + z > x) {
                System.out.println("Budujemy trójkąt!");
            } else {
                System.out.println("Błąd!");
                throw new CannotBuildTriangleException();
            }

        int obwod = x+y+z;
        return obwod;
    }
}
