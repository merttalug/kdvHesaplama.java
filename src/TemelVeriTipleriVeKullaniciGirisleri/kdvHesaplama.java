package TemelVeriTipleriVeKullaniciGirisleri;

import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
        double  para,kdvOrani;

        Scanner input = new Scanner(System.in);

        System.out.println("Paranızın değerini TL cinsinden giriniz: ");
        para=input.nextDouble();
        kdvOrani =0.18;

        double kdvMiktari,kdvliTutar;
        kdvMiktari = para*kdvOrani;
        kdvliTutar=para + kdvMiktari;

        System.out.println("Paranızın KDV'siz miktarı: " +para);
        System.out.println("Paranızın KDV miktarı: " +kdvMiktari);
        System.out.println("Paranızın KDV'li miktarı: " +kdvliTutar);





    }

}


