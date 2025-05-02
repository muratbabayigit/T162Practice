package day02;

import java.util.Scanner;

public class P04_ifStatements {
    public static void main(String[] args) {
        // Kullanıcıdan  bir sayı alın
        // sayı çift ise sayı çift sayıdır.
        // Tek ise sayı tek sayıdır
        // Sıfır girmişse Sıfır girdiniz yazdırsın



        Scanner scan=new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz: ");
        int sayi=scan.nextInt();

        if (sayi==0){
            System.out.println("Sıfır Girdiniz");
            return;
        }

        if(sayi%2==0){
            System.out.println("Girdiğiniz "+sayi+" sayısı çift sayıdır");
        }


        if (sayi%2!=0){
            System.out.println("Girdiğiniz "+sayi+" sayısı tek sayıdır");
        }


      //  System.out.println("Test Tamamlandı");


    }
}
