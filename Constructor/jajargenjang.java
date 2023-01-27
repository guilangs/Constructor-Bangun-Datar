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
public class jajargenjang {

    Scanner in = new Scanner(System.in);
    int a, t, sm;

    public jajargenjang(int alas, int tinggi, int sisimiring) {
        this.a = alas;
        this.t = tinggi;
        this.sm = sisimiring;
    }

    public void luasJajargenjang() {
        int luasJajargenjang = a * t;
        System.out.println("Luas Jajar Genjang = " + luasJajargenjang);
    }

    public void kelilingJajargenjang() {
        int kelilingJajargenjang = 2 * (a + sm);
        System.out.println("Keliling Jajar Genjang = " + kelilingJajargenjang);
    }
}
