package day05;

import java.util.Scanner;

public class P05_doWhileLoop {
          /*  Problem Tanımı
        Verilen bir sayının faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazınız.

        Örnek Ekran Çıktıları
        Bir sayi giriniz: 6
        Faktöriyeli: 720

        Bir sayı giriniz: 3
        Faktöriyeli 6


        while Loopl koşul sağlanmıyorsa çalışmasz. yani önce koşulu kontrol eder
        do while Loop ise bir kere çalışır sonra koşul sağlanıyor mu diye kontrol eder

    */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Faktoriyelini bulacağınız sayı: ");
        int sayi=scan.nextInt();
        int faktoriyel=1;

        do {
        faktoriyel*=sayi;
        sayi--;
        }while(sayi>0);

        System.out.println("Faktoriyel = " + faktoriyel);






    }
}
