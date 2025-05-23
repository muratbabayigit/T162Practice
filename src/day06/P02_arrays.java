package day06;

import java.util.Arrays;

public class P02_arrays {
    /*
     *String iniz: "Gayet Başarılı"  Diziyi "Çoook Başarılı" ye cevirin
     *
     */
    public static void main(String[] args) {
        String cumle = "Burası Kırıkkale";
        System.out.println(cumle );

        //toCharArray() metdou ile her bir harfi eleman olarak kabul eden char data türünde bir array oluşturuyoru
        char[] harfler = cumle.toCharArray();

        System.out.println(Arrays.toString(harfler));

        harfler[0]='Ş';
        //harfler[1]='o';
        //harfler[2]='o';
        //harfler[3]='o';
        //harfler[4]='k';

        System.out.println(Arrays.toString(harfler));

        String newWord=new String(harfler);


        System.out.println(newWord);


    }
}
