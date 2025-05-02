package day03;

public class P03_stringMethods {
    public static void main(String[] args) {
        /* indexOf()
         * char karakter ya da String metnin
         * kacinci indexden basladigini veren bir method dur.
         * Sonuc integer dir.
         * contains den farkı indexini verir, contains ise true false

         */

        String metin="Have a Nice Day!";
        System.out.println("N harfinin index numarası: "+metin.indexOf('N'));// 7
        System.out.println("c harfinin index numarası: "+metin.indexOf('c')); // 9
        System.out.println("z harfinin index numarası: "+metin.indexOf('z')); // -1
        System.out.println("a harfinin index numarası: "+metin.indexOf('a')); // 1
        System.out.println("Day kelimesinin başlangıç index numarası: "+metin.indexOf("Day")); //12


        /** lastIndexOf()
         *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini varır
         *  indexOf un sondan olan hali fakat index numaraları değişmez.
         */
        System.out.println("a harfinin index numarası: "+metin.lastIndexOf('a')); // 13
        System.out.println("N harfinin index numarası: "+metin.lastIndexOf('N'));// 7
        System.out.println("c harfinin index numarası: "+metin.lastIndexOf('c')); // 9


        /** substring()
         * Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir.
         * Sonuc ise String dir.
         */

        metin="Java Öğrenmek Çok Güzel!";
        System.out.println(metin.substring(5)); //5.indexten sonrasını yazdırır
        System.out.println(metin.substring(0,5)); //0,1,2,3,4. indexleri yazdırır
        System.out.println(metin.substring(metin.length()-6)); //son 5 karakteri yazdırır.

        /**trim()
         *Metnin basinda ve sonunda bulunan bosluklardan kurtulmayi saglar,
         *aralardaki bosluklara dokunmaz. Sonuc String dir.
         */

        metin=" Java Öğrenmek Çok Güzel! ";
        System.out.println(metin);
        System.out.println(metin.trim());
        /**
         * contains()
                * Metin icerisinde arama yapmamizi saglar.
         * bir stringin içerisinde karakter(ler)in var olup olmadığını kontrol eder.
                * Sonuc boolean dir.
         *
         * equals()
                * 2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.
         *
         * equalsIgnorecase()
                * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
         */










    }
}
