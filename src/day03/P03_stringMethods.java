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

        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
        // Stringlerle matematiksel islemler yapabilmemizi saglar.

        //valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
        //olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.

        String paraErkek = "1900";
        String paraKadin = "2000";

        //Bu ailenin toplam gelirini bulunuz.
        System.out.println(paraErkek + paraKadin);//19002000
        System.out.println(Integer.valueOf(paraErkek) + Integer.valueOf(paraKadin));//3900

        int maasErkek = 1900;
        int maasKadin = 2000;

        //maasErkek ve maasKadin sayilarini String'e donusturn ve concatenation yapin
        System.out.println(maasErkek + maasKadin);//3900
        System.out.println(String.valueOf(maasErkek) + String.valueOf(maasKadin));//19002000



        String girilenKelime = "65"; // su haliyle ahmet gibi bir kelimedir.sayisal isleme giremez
        int girilenSayi=65;

        // kelimenin -> sayiya cevrilmesi
        int girilenKelimeninSayiHali = Integer.parseInt(girilenKelime); // donusecek tipe uygun donusum
        short shortDeger = Short.parseShort(girilenKelime);
        double oran = Double.parseDouble(girilenKelime);

        // sayinin -> kelimeye cevrilmesi
        String girilenSayininKelimeHali = Integer.toString(girilenSayi); // degiskenin tipine uygun donusum
        String kelimeOran = Double.toString(oran);










    }
}
