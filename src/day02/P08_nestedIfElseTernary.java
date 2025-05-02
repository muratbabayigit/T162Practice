package day02;

import java.util.Scanner;

public class P08_nestedIfElseTernary {
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
            System.out.println("Maalesef kan bağışı yapamazsınız!");
        }else{
            if (weight>50.0) {
                System.out.println("Kan bağışı yapabilirisniz");
            }else{
                System.out.println("Maalesef kan bağışı yapamazsınız!");
            }
        }

        System.out.println("--------------------------------------");

        System.out.println(age<18 ? "Maalesef kan bağışı yapamazsınız!" : weight>50 ? "Kan bağışı yapabilirisniz": "Maalesef kan bağışı yapamazsınız!" );

    }
}
