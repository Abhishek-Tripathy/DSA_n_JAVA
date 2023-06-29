package Assignment;

import java.util.Scanner;

public class QuadraticEquation {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            roots(a,b,c);
        }
        public static void roots(int a, int b, int c){
            int discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                System.out.println("Real and Distinct");

                double root1 = (-b - Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b + Math.sqrt(discriminant)) / (2 * a);

                System.out.println((int) root1 + " " + (int) root2);
            } else if (discriminant == 0) {
                System.out.println("Real and Equal");

                double root = -b / (2.0 * a);

                System.out.println((int) root + " " + (int) root);
            } else {
                System.out.println("Imaginary");
            }
        }
    }


