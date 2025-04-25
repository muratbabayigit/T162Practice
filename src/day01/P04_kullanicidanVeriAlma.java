package day01;

import javax.swing.*;

public class P04_kullanicidanVeriAlma {
    public static void main(String[] args) {
        /*
        Kullanıcıya adını soyadını yaşını sorun ve tek bir sout içinde aşağıdaki formatta yazdırın
        Adı: Murat
        Soyadı: BABAYİĞİT
        Yaşı: 45
*/
        String name= JOptionPane.showInputDialog("Adınız: ");
        String surname= JOptionPane.showInputDialog("Soyadınız: ");
        String age= JOptionPane.showInputDialog("Yaş: ");
        JOptionPane.showMessageDialog(null,"Adı: "+name+"\nSoyadı: "+surname+"\nYaşı: "+age);

        System.out.println("Adı: "+name+"\nSoyadı: "+surname+"\nYaşı: "+age);
        // JOptionPane.showInputDialog ile sadece String veri alınabilir.


    }
}
