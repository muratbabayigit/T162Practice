package day02;

import java.util.Scanner;

public class P01_dataCasting {
    /*
            Kullanıcıdan iki double sayı alın ve ilk sayıyı ikinci sayıya bölün ve
            sonucu tam sayı yazdırın
            // byte<short<int<long<float<double
    */
    public static void main(String[] args) {
        Scanner wise = new Scanner(System.in);
        // System.out.println("İki adet ondalıklı sayı giriniz!");
        // System.out.print("1. Sayı: ");
        // double sayi1=wise.nextDouble();
        // System.out.print("2.Sayı: ");
        // double sayi2=wise.nextDouble();
        // int sonuc=(int)(sayi1/sayi2);
        // System.out.println(sayi1+"/"+sayi2+"="+sonuc);


        // System.out.println("\n\n---------------------------------------------------------\n");
/*
        Kullanıcıdan iki int sayı alın ve ilk sayıyı ikinci sayıya bölün ve
        sonucu ondalıklı sayı olarak yazdırın
*/
        System.out.println("Lütfen iki adet tam sayı giriniz!");
        System.out.print("1. Tam sayı:");
        int tamSayi1 = wise.nextInt();
        System.out.print("2. Tam sayı:");
        int tamSayi2 = wise.nextInt();
        double sonuc2 = (double) tamSayi1 / tamSayi2; //sonuc2 = 3,333333335
        //double sonuc2=  tamSayi1 /tamSayi2; sonuc2=3.0
        System.out.println(tamSayi1 + "/" + tamSayi2 + "=" + sonuc2);
        System.out.print("3. ondalıklı sayı:");
        double sayi3 = wise.nextDouble();
        double sonuc3=  sayi3 /tamSayi2;
        System.out.println("sonuc3 = " + sonuc3);





    }
}
