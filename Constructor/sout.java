/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package season2;

import java.util.Scanner;

/**
 *
 * @author MOKLET GAMING
 */
public class sout {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("BANGUN DATAR"
                + "\n 1. Lingkaran"
                + "\n 2. Segitiga"
                + "\n 3. Persegi"
                + "\n 4. Persegi Panjang"
                + "\n 5. Jajar Genjang");
        System.out.print("PILIH BANGUN DATAR = ");
        int pilihan = in.nextInt();
        System.out.println("=========================");
        if (pilihan == 1) {
            System.out.print("Masukkan Nilai Jari = ");
            double jari = in.nextDouble();
            lingkaran ling = new lingkaran(jari);
            ling.kelilingLingkaran(jari);
            ling.luasLingkaran(jari);

        } else if (pilihan == 2) {
            System.out.print("Masukkan Nilai Alas = ");
            int alas = in.nextInt();
            System.out.print("Masukkan Nilai Tinggi = ");
            int tinggi = in.nextInt();
            segitiga segi = new segitiga(alas, tinggi);
            segi.luas();
            segi.keliling();
        } else if (pilihan == 3) {
            System.out.print("Masukkan Nilai Alas = ");
            int sisi = in.nextInt();
            persegi per = new persegi(sisi);
            per.luasPersegi();
            per.kelilingPersegi();
        } else if (pilihan == 4) {
            System.out.print("Masukkan Nilai Panjang = ");
            int panjang = in.nextInt();
            System.out.print("Masukkan Nilai Lebar = ");
            int lebar = in.nextInt();
            persegiPanjang pers = new persegiPanjang(panjang, lebar);

            pers.luasPersegipanjang();
            pers.kelilingPersegipanjang();
        } else if (pilihan == 5) {
            System.out.print("Masukkan Nilai Alas = ");
            int alas = in.nextInt();
            System.out.print("Masukkan Nilai Tinggi = ");
            int tinggi = in.nextInt();
            System.out.print("Masukkan Nilai Sisi Miring = ");
            int sisimiring = in.nextInt();
            jajargenjang jaj = new jajargenjang(alas, tinggi, sisimiring);

            jaj.luasJajargenjang();
            jaj.kelilingJajargenjang();

        }

        System.out.println("=========================");
    }
}
