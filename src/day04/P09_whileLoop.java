package day04;

import java.util.Random;
import java.util.Scanner;

public class P09_whileLoop {
 /*
 sizin tarafınızdan belirlenmiş  bir sayıyı kullanıcıya soran ve
 sonu doğru bilirse Tebrik eden bilemezse yeniden isteyen bir sayı tahmin olyunu yazınız
  */
 public static void main(String[] args) {
     //int sayi=47;
     Random random=new Random();
     int sayi= random.nextInt(100);

     boolean dogruMu=false;
     Scanner scan=new Scanner(System.in);
     System.out.print("Aklımdan 1-100 arası bir sayı tuttum! Hadi Bil Bakalım\nTahminin: ");


     while(!dogruMu){
         int tahmin= scan.nextInt();
         if (tahmin>sayi){
             System.out.println("Tahmininiz: "+tahmin);
             System.out.println("Çok söyledin azalt!");
         }else if (tahmin<sayi){
             System.out.println("Tahmininiz: "+tahmin);
             System.out.println("Az söyledin arttır!");
         }else if (tahmin==sayi){
             System.out.println("Tebrikler doğru bildiniz!");
             System.out.println("Doğru Cevap: "+tahmin);
             dogruMu=true;

         }else {
             dogruMu=false;
         }


     }





 }

}
