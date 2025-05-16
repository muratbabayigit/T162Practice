package day05;

import java.util.Scanner;

public class P02_whileLoop {
    public static void main(String[] args) {
        /*
         * sayinin basamak degerlerinin toplamini
         * while loop ile yapan bir method create ediniz.
         */


        basamakDegerleriTopla();
    }

    public static void basamakDegerleriTopla() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Kontrol Edeceğiniz Sayıyı Giriniz!");
        System.out.print("Sayı: ");
        int sayi = scan.nextInt();
        int toplam=0;

        while (sayi!=0){
            toplam+=sayi%10;
            sayi=sayi/10;
        }

        System.out.print("Girilen Sayının Basamak Değerleri Toplamı: "+toplam);

    }


}
