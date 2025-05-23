package day06;

public class P01_arrays {
    public static void main(String[] args) {
        /* (çok boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{102,2,3},{4,51},{6,7,34}}
         * Output : 102
         */

        int [][] arr={{102,2,37,41,98},{4,51},{6,7,34}};
        enBuyukElmaniBul(arr);


    }

    public static void enBuyukElmaniBul(int[][] arr) {
        int enBuyuk=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j]>enBuyuk){
                    enBuyuk=arr[i][j];
                }
            }
        }
        System.out.println("enBuyuk = " + enBuyuk);
    }


}
