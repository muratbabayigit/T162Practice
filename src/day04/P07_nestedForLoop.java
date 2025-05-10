package day04;

import java.util.Scanner;

public class P07_nestedForLoop {
      /*

        kullanicidan satir sayisini alip asagidaki sekli cizdirin
        orn satir = 5

                *
                * *
                * * *
                * * * *
                * * * * *

         */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Şeklin En Uzun Kenarının Uzunluğunu Giriniz: ");
        int n= scan.nextInt();;

        for (int i = 1; i <= n; i++) { //satır sayısı takibi
            for (int j = 1; j <= i; j++) { //her satırda ne yapacağını
                System.out.print("* ");
            }
            System.out.println();


        }
    }
}
