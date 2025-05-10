package day04;

import java.util.Scanner;

public class P01_stringManipulation {
    // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
    // ad ayrı soyad ayrı sekilde ekrana yazdırınız.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Adınızı ve Soyadınızı yazınız. Adınız iki tane ise sadece birini yazınız\nAdı Soyadı: ");
        String isimSoyisim= scan.nextLine();
        String isim=isimSoyisim.substring(0,isimSoyisim.indexOf(" ")); //ikili index durumlarında ilki dahil, ikincisi dahil değildir
        String soyIsim=isimSoyisim.substring(isimSoyisim.indexOf(" ")+1);//tekli index durumlarında yazılan değer dahil olmak üzere sonuna kadar alır

        System.out.println("İsim: "+isim+"\nSoyisim: "+soyIsim);


    }
}
