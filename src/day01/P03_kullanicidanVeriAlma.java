package day01;

import java.util.Scanner;

public class P03_kullanicidanVeriAlma {
/*
        Kullanıcıya adını soyadını yaşını sorun ve tek bir sout içinde aşağıdaki formatta yazdırın
        Adı: Murat
        Soyadı: BABAYİĞİT
        Yaşı: 45
*/

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Adınızı, Soyadınızı ve Yaşınızı sırayla giriniz!");
        System.out.print("Adınız: ");
        //String name=scan.next();           //next olursa ilk boşluğa kadar alır
        String name= scan.nextLine();
        //System.out.println(name);
        System.out.print("Soyadınız: ");
        String surname= scan.nextLine();
        System.out.print("Yaşınız: ");
        int age= scan.nextInt();
       // System.out.println("Doğum Yeri: ");
       // String bornPlace= scan.nextLine(); //NextLİne Atlama Plroblemi makalesini oku
        System.out.println("Adı: "+name+"\nSoyadı: "+surname+"\nYaşı: "+age);

    }
}