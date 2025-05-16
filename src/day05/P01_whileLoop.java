package day05;

import java.util.Scanner;

public class P01_whileLoop {
    // kullanıcıdan alınan bir sayinin Armstrong sayi olup olmadigini kontrol eden code yazin
    // Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
    // 153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Kontrol Edeceğiniz Sayıyı Giriniz!");
        System.out.print("Sayı: ");
        int sayi = scan.nextInt();
        int ilkSayi = sayi;
        int toplam = 0;
        int basamak;


        while (sayi > 0) {
            basamak = sayi % 10; //verilen sayının 10 ile bölümünden kalanı basamak degeri olarak atadı. sayı 153 ise basamak değeri olark 3 değerini atadı
            toplam += basamak * basamak * basamak; //birler basmağının küpünü alıp toplama ekledi. sayı 153 iken basamak değeri 3 ise onun küpünü toplama ekledi
            sayi = sayi / 10; //sayıyı iki basamaklı hale getirdim. 153 sayısını 15 yaptım.

        }
        //  System.out.println(toplam);

        if (ilkSayi == toplam) {
            System.out.println("Girdiğiniz " + ilkSayi + " sayısı bir armstrong sayısıdır.");
        } else {
            System.out.println("Girdiğiniz " + ilkSayi + " sayısı bir armstrong sayısı değildir.");
        }


    }
}
