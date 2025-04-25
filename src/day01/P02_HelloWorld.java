package day01;

public class P02_HelloWorld {
       /*
                Soru: Consola

                Hello World   "Hello World"


                iki Hello World arasında bir TAB boşluk vardır
                yazdırın.

       */
       public static void main(String[] args) {
           //    \t : 1 TAB tuşu boşluk bırakır
           //    \n : metin için alt satıra geçer
           //    \" : çift tırnak ifasdesini metin olarak alır
           //    \' : tek tırnak ifasdesini metin olarak alır

           System.out.println("Hello World");
           System.out.println("Hello World\t\"Hello World\"");

           System.out.println("--------------------------------------------------------------------");
                /*
                Soru: Consola

                Hello World
                   "Hello World"


                iki Hello World arasında bir TAB boşluk vardır
                yazdırın.

       */

           System.out.println("Hello World\n\t\"Hello World\"");

       }

}
