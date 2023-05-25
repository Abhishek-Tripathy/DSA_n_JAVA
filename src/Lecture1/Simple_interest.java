package Lecture1;

import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principle = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();

        int simple_interest = principle*rate*time/100;
        System.out.println(simple_interest);
    }
}
