package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.print("Sayı giriniz :");
        int n= inp.nextInt();
        double k=0.0;
        for (double i=1;i<=n;i++){
            k+=(1/i);
        }
        System.out.println(k);
    }
}