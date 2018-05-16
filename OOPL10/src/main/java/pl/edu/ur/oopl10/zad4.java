/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.Random;

/**
 *
 * @author student
 */
public class zad4 {

    public static void main(String[] args) {
        int l1;
        int l2;
        int ilowyj = 0;
        double wyn = 0;
        boolean wyl = false;
        Random loslicz = new Random();

        while (wyl != true) {
            if (ilowyj >= 3) {
                wyl = true;
            } else {
                l1 = loslicz.nextInt(10 - (-10)) + -10;
                l2 = loslicz.nextInt(10 - (-10)) + -10;
                System.out.print("\n" + l1 + " / " + l2 + " = ");

                try {
                    wyn = l1 / l2;
                    System.out.print(wyn);
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                    ilowyj++;
                }
            }
        }
    }
}
