package day04;

public class P06_forLoop {
    public static void main(String[] args) {
        //        1 2 3 4 5 6
        //         2 3 4 5 6
        //          3 4 5 6
        //           4 5 6
        //            5 6
        //             6

//   şeklini konsola yazdiriniz.

        for (int i = 1; i <= 6; i++) {
            //boşluk yazdır
            for (int bosluk = 0; bosluk < i; bosluk++) {
                System.out.print(" ");
            }

            //sayıları yazdır
            for (int j = i; j <= 6; j++) {
                System.out.print(j+" ");
            }
            System.out.println(); //satır sonu
        }


    }
}
