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
public class persegiPanjang {

    Scanner in = new Scanner(System.in);
    int p, l;

    public persegiPanjang(int panjang, int lebar) {
        this.p = panjang;
        this.l = lebar;
    }

    public void luasPersegipanjang() {
        int luasPersegi = p * l;
        System.out.println("Luas Persegi Panjang = " + luasPersegi);
    }

    public void kelilingPersegipanjang() {
        int kelilingPersegi = 2 * (p + l);
        System.out.println("Keliling Persegi Panjang= " + kelilingPersegi);
    }
}
