package Lecture5;

import java.util.Scanner;



    public class Prime_Little_Optimised {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int factorial =0;
            int i = 2;
            while(i<n){
                if(n%i==0){
                    factorial++;
                    System.out.println("Not prime");
                    return;
                }
                i++;
            }
            System.out.println("Prime");
            }
        }




