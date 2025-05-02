package day03;

import java.util.Scanner;

public class P02_switchCase {
    /*
        Bir bankamatik menüsü ve seçime göre işlem yapan bir JAVA Programı Yazınız

        ========= WISE BANK ATM =========
        ============== MENU =============
            1- Hesap Bakiyesi Göster
            2- Para Çek
            3- Para Yatır
            4- Şifre Değiştirme
            5- Çıkış

 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("==================================== WISE BANK ATM ====================================");
        System.out.println("Wise Ban ATM'sine Hoşgeldiniz. Lütfen Aşğaıdaki Menünden Yapacağınız İşlemi Seçiniz\n");
        System.out.println("============== MENU =============");
        System.out.println("\t1- Hesap Bakiyesi Göster\n\t2- Para Çek\n\t3- Para Yatır\n\t4- Şifre Değiştirme\n\t5- Çıkış ");
        System.out.print("İşlem Numaranız: ");
        int secim= scan.nextInt();
        int bakiyeTL=103276;

        String sifre="Mb971671&";

        switch (secim){
            case 1:
                System.out.println("Hesabınızda bulunan ₺ Tutarı bakiye: "+bakiyeTL);
                break;
            case 2:
                System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                int cekilecekTutar=scan.nextInt();
                if (cekilecekTutar>bakiyeTL){
                    System.out.println("Bakiyeniz İstediğiniz tutar için yeterli değildir\nBakiyeniz: "+bakiyeTL);
                }else{
                    bakiyeTL=bakiyeTL-cekilecekTutar;
                    System.out.println("Lütfen paranızı ilgili bölmeden alınız!\n\tÇekilen tutar: "+
                                        cekilecekTutar+"\n\tYeni Hesap Bakiyeniz:"+bakiyeTL);
                }
                break;
            case 3:
                System.out.print("Yatıracağınız Tutarı Giriniz: ");
                int yatanTutar=scan.nextInt();
                if (yatanTutar>0) {
                    bakiyeTL = bakiyeTL + yatanTutar;
                    System.out.println("Paranız Sayılıyor!\nParanız Hesabınıza Aktarılıyor\n\tHesap Bakiyeniz: " + bakiyeTL);
                }else{
                    System.out.println("Tutarı Yanlış Girdiniz");
                }
                break;
            case 4:
                System.out.println("Yeni şifre belirleme ekranına hoş geldiniz.\n Yeni Şifrenizi Giriniz");
                System.out.print("\n\tYeni Şifreniz: ");
                String sifre1=scan.next();
                System.out.print("\tYeni Şifrenizi Tekrar Giriniz: ");
                String sifre2=scan.next();
                if(sifre1.equals(sifre2)){
                    sifre=sifre1;
                    System.out.println("\nŞifreniz başarıyla değiştirildi");
                }else{
                    System.out.println("\nGirdiğiniz yeni şifreler birbiriyle uyuşmuyor." +
                            "\nGüvenlik nedeniyle işlem durduruldu.");
                }
                break;
            case 5:
                System.out.println("Çıkış Yapılıyor");
                System.exit(0);
            default:
                System.out.println("Yanlış bir seçim yaptınız. İşlem Durduruldu.");
        }

        /*
            Çalışma Önerisi
            Kullanıcının USD ve EUR hesapları da olsun,
            Hesap Bakiyesi gösterme, para yatırma, para çekme
            menülerindeki işlemleri bu hesapları da bağlayacak şekilde düzenleyiniz

         */



    }
}
