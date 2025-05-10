package day04;

import java.util.Scanner;

public class P08_nestedForLoop {
    /*
 Kullanıcıdan baklava deseninin genişliğini alıp
 örneğin 5 için aşağıdaki baklava desenini yazdırınız
               *
              * *
             * * *
            * * * *
           * * * * *
            * * * *
             * * *
              * *
               *

    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Baklava Deseninin Genişliğini Giriniz: ");
        int n = scan.nextInt();



        //üst yarısını yazdıracğız 1'den n'e kadar olan
        for (int i = 1; i <= n; i++) { //satır sayısı
            //boşlukları yazdıralım
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            //yıldızları yazdıralım
            for (int k = 1; k <=i ; k++) {
                System.out.print("* ");

            }
            System.out.println(); //satır sonu
        }
        // Yukarıda 1 2 3 4 5
        //baklava deseninin alt yarısını yazdıralım ( 5 yazıldı bir sornaki satır 4 olmalı )
        // 4 3 2 1  olması için  n-1,n-2,n-3,n-4 ....1 'e kadar yıldız her bir satırda 1 adet azalasın

        for (int i = n-1; i >=1 ; i--) {
            //boşluklar yazdıralım
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }



    }
}
