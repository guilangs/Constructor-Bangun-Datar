/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package season2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author MOKLET GAMING
 */
//lingkaran
public class lingkaran {

    Scanner in = new Scanner(System.in);
    double p = 3.14;
    double j;

    public lingkaran(double jari) {

        this.j = jari;
    }

    public void luasLingkaran(double jari) {
        double luasLingkaran = p * j * j;
        System.out.println("luas Lingkaran = " + luasLingkaran);
    }

    public void kelilingLingkaran(double jari) {
        double kelilingLingkaran = (2 * j) * p;
        System.out.println("Keliling Lingkaran = " + kelilingLingkaran);
    }
}
