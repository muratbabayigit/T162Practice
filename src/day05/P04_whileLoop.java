package day05;

public class P04_whileLoop {
    public static void main(String[] args) {
         /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

        double yukseklik=1584;
        double alinanYol=0;
        int sayac=0;

        while(yukseklik>=1.0){
            alinanYol+=yukseklik;
            yukseklik=(yukseklik)*0.75; //3/4 %75 demektir
            sayac++;
            alinanYol+=yukseklik;
        }

        System.out.println("Topun Zıplama Sayısı: "+sayac);
        System.out.println("Topun aldığı yol: "+alinanYol);
    }
}
