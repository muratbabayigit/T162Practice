package day02;

import java.util.Scanner;

public class P09_artikYil {
/*
    Girilen yılın artık yıl olup olmadığını bulunuz
    Şartlar:
    Artık yıl
    4'e bölünen ama 100'e bölünmeyen yıllardır
    100'e bölünen yıllardan aynı zamanda 400' de bölünebilen yıllardır
*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("=========== Artık Yıl Kontrol Programı ===========");
        System.out.print("Kontrol edeceğiniz yılı giriniz: ");
        int yil=scan.nextInt();

        if (yil%100==0 && yil%400==0) {
            System.out.println(yil+" yılı bir artık yıldır.");
        }else if (yil%4==0 && yil%100!=0) {
            System.out.println(yil+" yılı bir artık yıldır.");
        }else{
            System.out.println(yil+" yılı bir artık yıl değildir.");
        }

        System.out.println("******** Ternary Çözümü *********");
        System.out.println(yil%100==0 ? yil%400==0 ? yil+" yılı bir artık yıldır." : yil+" yılı bir artık yıl değidlir."
                : yil%4==0 ?yil+" yılı bir artık yıldır." :yil+" yılı bir artık yıl değildir.");

    }
}
