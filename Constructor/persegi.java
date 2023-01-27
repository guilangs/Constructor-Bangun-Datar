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
public class persegi {

    Scanner in = new Scanner(System.in);
    int s;

    public persegi(int sisi) {
        this.s = sisi;
    }

    public void luasPersegi() {
        int luasPersegi = s * s;
        System.out.println("Luas Persegi = " + luasPersegi);
    }

    public void kelilingPersegi() {
        int kelilingPersegi = 4 * s;
        System.out.println("Keliling Persegi = " + kelilingPersegi);
    }
}
