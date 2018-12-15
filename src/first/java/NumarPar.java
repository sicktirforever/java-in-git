package first.java;

import java.util.Scanner;

public class NumarPar {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Valoarea lui n este: ");
         int n = sc.nextInt();
        System.out.println("N = " + n);
        if (n % 2 == 0){
            System.out.println("Numarul " + n + " este par");
        }
            else {
            System.out.println("Numarul " + n + " nu este par");

        }
            numarPrim();
    }

    public static void numarPrim(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Valoarea lui n este: ");
        int n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println("Numarul " + n + " este par");
        }
        else {
            System.out.println("Numarul " + n + " nu este par");

        }
        return;
    }

}
