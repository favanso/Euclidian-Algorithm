
package euclidian.algorithm;

import java.util.Scanner;

public class EuclidianAlgorithm {

    public static void main(String[] args) {
        double x, y, z;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("This game will show you the biggest divisor "
                + "between two numbers");
        System.out.println("Choose your first number");
        x = scanner.nextDouble();
        
        System.out.println("Choose your second number");
        y = scanner.nextDouble();
        
        if (x > y) {
            z = x % y;
            if (z == 0) {
                System.out.println(y);
            } else {
                while (y != 0) {
                    z = x % y;
                    x = y;
                    y = z;
                }
                System.out.println(x);
            }
        }
        
        else if (y > x) {
            z = y % x;
            if (z == 0) {
                System.out.println(x);
            } else {
                while (z != 0) {
                    z = y % x;
                    y = x;
                    x = z;
                }
                System.out.println(y);
            }

        }

    }

}
