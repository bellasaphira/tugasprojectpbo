package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

           Trapesium x = new Trapesium();

                Scanner input = new Scanner(System.in);
                System.out.println();
                System.out.println("===Kalkulator Trapesium===");
                System.out.println("Masukan sisi yang panjang : ");
                x.sisipanjang = input.nextInt();
                System.out.println("Masukan sisi yang pendek : ");
                x.sisipendek = input.nextInt();
                System.out.println("Masukan tinggi : ");
                x.t = input.nextInt();
                System.out.println("Masukan sisi miring 1 : ");
                x.sisimiring1 = input.nextInt();
                System.out.println("Masukan sisi miring 2 : ");
                x.sisimiring2 = input.nextInt();

                System.out.println();
                System.out.println("Silahkan pilih rumus");
                System.out.println("1. Luas Trapesium");
                System.out.println("2. Keliling Trapesium");
                System.out.println("Masukan pilihan anda : ");
                int pilih = input.nextInt();

                switch (pilih) {
                    case 1: {
                        System.out.println("Luas Trapesium : " + x.luas());
                        break;
                    }
                    case 2: {
                        System.out.println("Keliling Trapesium : " + x.keliling());
                        break;
                    }
                }
            }
}
