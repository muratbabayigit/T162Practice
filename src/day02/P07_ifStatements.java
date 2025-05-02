package day02;

import java.util.Scanner;

public class P07_ifStatements {
    public static void main(String[] args) {
        /*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = (kilo(kg) /(boy*boy)(cm))*10000
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.

		 */

        Scanner scan=new Scanner(System.in);
        System.out.print("Boy uzunuluğuzu cm olarak giriniz :");
        int boy=scan.nextInt();
        System.out.print("Kilonuzu kg olarak giriniz : ");
        double kilo= scan.nextDouble();

        double bmi=(kilo/(boy*boy))*10000;

        if (bmi<=20){
            System.out.println("oldukça zayısınız");
        }else if (bmi>20 && bmi<=25){
            System.out.println("Normal sınırlardasınız");
        } else if (bmi>25 && bmi<=30) {
            System.out.println("Kilolu gruptasınız");
        }else{
            System.out.println(" Dikkat Obez sınıfındasınız");
        }


    }
}
