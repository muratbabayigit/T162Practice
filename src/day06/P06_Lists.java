package day06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06_Lists {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner scan=new Scanner(System.in);
        System.out.print("Not girmek için E tuşuna basınız!: ");
        char devam=scan.next().toUpperCase().charAt(0);
        List<Double> nots=new ArrayList<>();

        while(devam=='E'){
            System.out.print("Not Girişi: ");
            nots.add(scan.nextDouble());
            System.out.print("Yeni bir not girecek misiniz!(E/H): ");
            devam=scan.next().toUpperCase().charAt(0);
        }

        System.out.println(nots);
        int toplam=0;
        for (double each:nots) {
            toplam+=each;
        }
        double ortalama=toplam/nots.size();
        int sayac=0;
        for (double each2:nots) {
            if (each2 > ortalama){
                sayac++;
            }

        }
        System.out.println("Sınıf Not Ortalaması: "+ortalama);
        System.out.println("Sınava giren "+nots.size()+" ortalamayı geçen "+sayac+" kişi bulunmaktadır.");






    }
}
