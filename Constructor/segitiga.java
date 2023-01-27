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
public class segitiga {

    Scanner in = new Scanner(System.in);
    int a, t;

    public segitiga(int alas, int tinggi) {
        this.a = alas;
        this.t = tinggi;
    }

    public void luas() {

        double luas = 0.5 * a * t;
        System.out.println("Luas Segitiga = " + luas);
    }

    public void keliling() {

        double keliling = 3 * a;
        System.out.println("Keliling Segitiga = " + keliling);
    }
}
