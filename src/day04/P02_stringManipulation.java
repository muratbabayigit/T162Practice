package day04;

public class P02_stringManipulation {
    public static void main(String[] args) {
/*
    String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
    String str1= %13.99
    String str2= %10.55
*/

        String str1= "%15.98";
        String str2= "%13.56";

        String str1New=str1.substring(1);
        Double dbl1=Double.parseDouble(str1New);
        Double dbl2=Double.parseDouble(str2.substring(1));

        System.out.println("\nToplam: "+(dbl1+dbl2));




    }
}
