package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km,yas,tip;
        System.out.println("Mesafeyi giriniz :");
        km=scanner.nextInt();
        System.out.println("\nYaşınızı giriniz : ");
        yas=scanner.nextInt();
        System.out.println("\nYolculuk tipini seçiniz (1-Tek gidiş , 2-Gidiş/Dönüş) : ");
        tip=scanner.nextInt();

        double normalFiyat,yasIndirimi,tipIndirimi;

        if (km > 0 && yas > 0 && (tip==1 || tip==2)){
            normalFiyat=km * 0.10;
            if (yas<12){
                yasIndirimi=normalFiyat * 0.5;
            }else if (yas>=12 && yas<=24){
                yasIndirimi=normalFiyat * 0.10;
            }else if (yas>=65){
                yasIndirimi=normalFiyat * 0.30;
            }else {
                yasIndirimi=0;
            }
            normalFiyat=normalFiyat-yasIndirimi;
            if (tip==2){
                tipIndirimi=normalFiyat * 0.20;
                normalFiyat=normalFiyat-tipIndirimi;
            }
            System.out.println("Bilet tutarı : "+normalFiyat+ "$");

        }
        else
        {
            System.out.println("Girdiğiniz bilgiler eksik veya yanlış lütfen tekrar deneyiniz !");
        }
    }
}
