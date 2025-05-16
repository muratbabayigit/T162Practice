package day05;

import java.util.Arrays;
import java.util.Scanner;

public class P06_arrays {
    // kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini
    // kullanicidan alan ve girilen array elemanlarinin
    // en buyuk ile en kucuk elemaninin arasindaki farki gosteren java programi yazin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Dizi[Array] uzunuluğunu giriniz: ");
        int n= scan.nextInt();

        int [] arr=new int[n]; //n elemanlı bir boş array oluşturuyor.

        for (int i = 0; i < arr.length; i++) {  //arr.length ile n yazmak arasında fark yoktur
            System.out.print(i+1+". eleman: ");
            int sayi= scan.nextInt();
            arr[i]=sayi;
        }
        //array'ler index mantığına göre çalışır. İlk elemanın indeksi 0 olduğu için for loop 0'dan başlatıldı.

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.print("Bu dizinin enBüyük elemanı ile enKucuk elemanı arasındaki fark: ");
        System.out.println(arr[arr.length-1]-arr[0]);





    }
}
