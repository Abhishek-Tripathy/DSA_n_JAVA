package Lecture1;

import java.util.Scanner;

public class Greatest_of_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        main part जरूरी भागा

        if(a>b){
            if(a>c){
                System.out.println(a);
            }

            else if(b>a){
                if(b>c){
                    System.out.println(b);
                }

                else{
                    if(c > b){
                        System.out.println(c);
                    }
                }

            }

        }

    }
}