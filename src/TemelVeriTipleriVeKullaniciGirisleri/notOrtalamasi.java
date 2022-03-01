package TemelVeriTipleriVeKullaniciGirisleri;

import java.util.Scanner;

public class notOrtalamasi
{
    public static void main(String[] args) {

        int mat, fizik, tarih, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat= input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik=input.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih=input.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce=input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya=input.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik=input.nextInt();

        int toplam = (mat+fizik+turkce+tarih+kimya+muzik);
        double sonuc= toplam/6.0;

        String gecmeDurumu = sonuc >=60 ? "Tebrikler, sınıfı Geçtiniz." : "Sınıfta Kaldınız !";

        System.out.println("Ortalamanız: "+sonuc);
        System.out.println(gecmeDurumu);







    }

}
