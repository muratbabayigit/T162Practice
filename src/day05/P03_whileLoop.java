package day05;

import java.util.Scanner;

public class P03_whileLoop {
    public static void main(String[] args) {
        // kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
        // kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create
        // ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.print("Bölünecek Sayı: ");
        int bolunen= scan.nextInt();
        System.out.print("Bölecek Sayı: ");
        int bolen= scan.nextInt();
        int kalan=0;

        bolumSonucuBulma(bolunen,bolen);
        kalanBulma(bolunen,bolen,kalan);
    }

    public static void bolumSonucuBulma(int bolunen, int bolen) {
        int sayac=0;
        int ilkSayi=bolunen;
        while (bolunen>=bolen){
            bolunen=bolunen-bolen;
            sayac++;

        }

        System.out.println(ilkSayi+" sayısının "+bolen+" sayısı ile bölümü : "+sayac);



    }

    public static void kalanBulma(int bolunen, int bolen, int kalan){
        int sayac=0;
        int ilkSayi=bolunen;
        while (bolunen>=bolen){
            bolunen=bolunen-bolen;
            sayac++;
            kalan=bolunen;

        }

        System.out.println(ilkSayi+" sayısının "+bolen+" sayısı ile bölümünden kalan: "+kalan);

    }
}

