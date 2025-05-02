package day02;

public class p02_IncrementDecrement {
    public static void main(String[] args) {
        int a=59;
        System.out.println("a = " + a); //59

        a+=5; // a'nın değerini 5 arttır ve a'ya yeni değer olarak ata
        System.out.println("a = " + a); //64
        a-=4;
        System.out.println("a = " + a);//60
        a*=2;
        System.out.println("a = " + a);//120
        a/=10;
        System.out.println("a = " + a);//12

        int b=--a; //a degerini önce azaltıyor sonra b'ye de o degeri atıyor
        System.out.println("b = " + b);// 11
        System.out.println("a = " + a);// 11

        int c=a++; //önce c degerine a degerini atıyor ve a degerini 1 arttırıyor
        System.out.println("c = " + c); //11
        System.out.println("a = " + a);//12


    }
}
