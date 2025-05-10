package day04;

import java.util.Scanner;

public class P04_stringManipulation {
     /*

         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük/Büyük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
    */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Sizden İstenen Bilgileri Giriniz!");
        System.out.print("Adınız: ");
        String name= scan.nextLine();
        System.out.print("Soyadınız: ");
        String surname= scan.nextLine();
        System.out.print("16 Haneli kredi Kartı Numaranız: ");
        String creditCardNumber= scan.nextLine();
        /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */

        name=name.toUpperCase().substring(0,1)+name.substring(1).replaceAll("\\w","*");
        surname=surname.toUpperCase().substring(0,1)+surname.substring(1).replaceAll("\\w","*").replaceAll("\\W","*");

        System.out.println(name);
        System.out.println(surname);

        creditCardNumber=creditCardNumber.replaceAll("\\s","");
        System.out.println("creditCardNumber = " + creditCardNumber);
        //if(creditCardNumber!=16)
        if(creditCardNumber.length()>16 || creditCardNumber.length()<16){
            System.out.println("Geçersiz Kredi Kartı Numarası Girdiniz!");
        }else {
            creditCardNumber=creditCardNumber.substring(0,11).replaceAll("\\d","*")+creditCardNumber.substring(12);
        }

        System.out.println("Ad: "+name+" Soyad: "+surname+" kartNo: "+creditCardNumber);




    }
}
