package day03;

import java.util.Scanner;

public class P01_switchCase {
    //Soru: Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

    //kullanıcı 321 biz üçyüz yirmi bir yazdıracağız

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 3 basamaklı bir sayı giriniz: ");
        int number=scan.nextInt(); //321
        int sayi=number;
        int birlerBasmagi=sayi%10;
        sayi=sayi/10;
        int onlarBasamagi=sayi%10;
        int yuzlerBasamagi=sayi/10;
        // sayi=3 oldu
        if (number<100 || number>999){
            System.out.println("3 basamaklı bir sayı girmeniz gerekiyordu.\nYanlış giriş yaptınız." +
                    "Program Durduruldu.");
        }else{
            switch (yuzlerBasamagi){
                case 1:
                    System.out.print("yüz ");
                    break;
                case 2:
                    System.out.print("ikiyüz ");
                    break;
                case 3:
                    System.out.print("üçyüz ");
                    break;
                case 4:
                    System.out.print("dörtyüz ");
                    break;
                case 5:
                    System.out.print("beşyüz ");
                    break;
                case 6:
                    System.out.print("altıyüz ");
                    break;
                case 7:
                    System.out.print("yediyüz ");
                    break;
                case 8:
                    System.out.print("sekizyüz ");
                    break;
                case 9:
                    System.out.print("dokuzyüz ");
                    break;
                default:
            }
            switch (onlarBasamagi){
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("on ");
                    break;
                case 2:
                    System.out.print("yirmi ");
                    break;
                case 3:
                    System.out.print("otuz ");
                    break;
                case 4:
                    System.out.print("kırk ");
                    break;
                case 5:
                    System.out.print("elli ");
                    break;
                case 6:
                    System.out.print("atmış ");
                    break;
                case 7:
                    System.out.print("yetmiş ");
                    break;
                case 8:
                    System.out.print("seksen ");
                    break;
                case 9:
                    System.out.print("doksan ");
                    break;
                default:
            }
            switch (birlerBasmagi){
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("bir");
                    break;
                case 2:
                    System.out.print("iki");
                    break;
                case 3:
                    System.out.print("üç");
                    break;
                case 4:
                    System.out.print("dört");
                    break;
                case 5:
                    System.out.print("beş");
                    break;
                case 6:
                    System.out.print("altı");
                    break;
                case 7:
                    System.out.print("yedi");
                    break;
                case 8:
                    System.out.print("sekiz");
                    break;
                case 9:
                    System.out.print("dokuz");
                    break;

                    default:
            }
        }
    }
}
