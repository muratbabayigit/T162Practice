package day06;

import java.util.Arrays;

public class P03_arrays {
    public static void main(String[] args) {
        /*
         * Write a method which accepts string as parameter and prints the sum of digits
         * present in thr given string input :"ade1r4d3" output : 8 ;
         * trick : Use --> Character.isDigit() --> Integer.valueOf()
         */


        //içerisinde hem rakam hem de harf barındıran bir String ifade oluşturduk
        String ifade="46h8gt3re9a5"; //35

        //Bu ifadenin içinde sayısal karakterleri labilmek için tüm elemanlarını ayrı ayrı elaman kabul eden bir array oluşturduk
        String arr[]=ifade.split(""); // ifade dediğimiz 46-h-8-gt-3-re-9-a-5 regex:"-" olurdu
        System.out.println(Arrays.toString(arr));
        System.out.println("------------------------------------------------------------------------\n");
        int toplam=0;

        //bu döngüde ise array içindeki elemanları tek tek kontrol ettik. Rakam olan string üyeleri bulup
        for (int i = 0; i < arr.length; i++) {
          if (Character.isDigit(arr[i].charAt(0))){

              //bu bulunan sayıların değerini toplama ekleyen kod burası
              toplam+=Integer.valueOf(arr[i]);
          }
        }
        System.out.println("toplam = " + toplam);


    }
}
