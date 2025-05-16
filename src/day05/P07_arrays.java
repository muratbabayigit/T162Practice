package day05;

import java.util.Arrays;

public class P07_arrays {
    /*
     * $ ve € isareti olanlarin toplamlarini ayri ayri bulun
     *
     * String str = "$1 $23 $134 $2 $7 $24 €32 €40 €2 €65 €4 ";
     */

    public static void main(String[] args) {
        String str = "$1-$23-$134-$2-$7-$24-€32-€40-€2-€65-€4";
        String [] arr= str.split("-");
        //System.out.println(Arrays.toString(arr)); [$1, $23, $134, $2, $7, $24, €32, €40, €2, €65, €4]
        int dolarKasa=0;
        int euroKasa=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("$")){
                dolarKasa+=Integer.parseInt(arr[i].replace("$",""));
            }else{
                euroKasa += Integer.parseInt(arr[i].replace("€",""));
            }
        }

        System.out.println("========== KASALAR TOPLAMI ==========");
        System.out.println("DOLAR KASASI TOPLAMI= "+dolarKasa);
        System.out.println("EURO KASASI TOPLAMI= "+euroKasa);





    }
}
