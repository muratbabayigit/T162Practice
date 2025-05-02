package day02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P06_ifElseStatements {
    public static void main(String[] args) {
        // Kullanicidan  yasini ve kilosunu alaliniz
        // 18 yasindan kucuk ise kan bagisi yapamaz
        // 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        // 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.


        Scanner scan=new Scanner(System.in);
        System.out.print("Yaşınızı giriniz: ");
        int age=scan.nextInt();
        System.out.print("Kilonuzu giriniz: ");
        double weight=scan.nextDouble();

        if (age<18){
            System.out.println("Maalesef siz kan bağışı yapamazsınız!");
        } else if (age>=18 && weight>50.0) {
            System.out.println("Kan bağışı yapmaya uygunsunuz! Teşekkürler");
        }else{
            System.out.println("Maalesef siz kan bağışı yapamazsınız!");
        }
    }
}
