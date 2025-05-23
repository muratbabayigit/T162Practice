package day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P05_Lists {
    public static void main(String[] args) {
        /*
         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir program yaziniz
         *
         * INPUT : list={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */


        List<String> listemiz = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));

        List<String> newList = new ArrayList<>();

        for (int i = 0; i < listemiz.size(); i++) {

            if (!(listemiz.get(i).toLowerCase().contains("a"))) {
                newList.add(listemiz.get(i));
            }
        }

      //for (String each:listemiz) {
      //    if (!each.toLowerCase().contains("a")){
      //        newList.add(each);
      //    }


        System.out.println(listemiz);
        System.out.println(newList);

        }

    }

