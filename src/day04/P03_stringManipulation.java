package day04;

import java.util.Scanner;

public class P03_stringManipulation {
    public static void main(String[] args) {

 /*
       kullanıcıdan bir e-posta adresi girmesini isteyin,
       ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
       örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
 */
        Scanner scan=new Scanner(System.in);
        System.out.print("Email Adresiniz: ");
        String email= scan.next();

        if (email.contains("hotmail")){
           // email=email.replace("hotmail","gmail");
            email=email.replaceAll("hotmail","gmail");

        }

        System.out.println("Sisteme Kayıt Alınan Mail Adresiniz: "+email);
    }
}
