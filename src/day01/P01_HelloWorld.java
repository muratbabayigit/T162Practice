package day01;

public class P01_HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Merhaba Dünya");
        int a = 100;
        System.out.println("a = " + a);
        System.out.println("-------------------------------------------------------------");

        System.out.println("Onur Köksal -"); System.out.println("Ahmet Eldes");
        //println yazdırdıktan sonra hemen alt satıra geçer
        // Eğer aynı satırda devam etmesini istersek println yerine print yazarız
        System.out.print("Onur Köksal -"); System.out.print(" Ahmet Eldes");

        //Hata metnini yazdırmak için err kullanılır

        System.err.println("Burada Hata Kodu olur");
        System.out.println("Fakat bu kodu nerede yazdıracağını belirlememiz zordur");



    }
}
