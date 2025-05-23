package day05;

public class Odev_arrays {
    // arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }  veriliyor.
    // Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
    public static void main(String[] args) {
        //iki farklı multidimensional array tanımladık
        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};

        //toplam methodu ile iki arrayin iç toplamlarını topladık ve yazdırdık
        int toplam = topla(arr1) + topla(arr2);
        // 21+57=78
        System.out.println("Tüm elemanlar toplamı: " + toplam);


    }


    public static int topla(int[][] arr) {
        //bir arrayin içindeki elemanların toplamını bulacak bir method yazıyoruz.
        // Bunun için bir toplam variable'ı oluşturduk.
        int toplam = 0;

        //ilk olarak array'in içindeki arrayleri dolaşacak bir for Eachloop yazdık
        for (int[] altRArr : arr) {
            //Burada ise içerdeki her bir array'i ayrı ayrı dolaşacak bir for each loop yazdık
            // bu for each loop array'in içindeki elemanları tek tek sırayla toplam'a ekledi
            for (int sayi : altRArr) {
                toplam += sayi;

            }

        }
        //bütün elemanlar eklenince de sonucu bize döndürmesini sağladık
        return toplam;

    }
}
