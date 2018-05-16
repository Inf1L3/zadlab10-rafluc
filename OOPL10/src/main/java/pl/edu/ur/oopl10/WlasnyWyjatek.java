/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

/**
 *
 * @author student
 */
public class WlasnyWyjatek {

    public static void main(String args[]) {
        int dzielna, dzielnik, wynik;
        try {
            dzielna = 128;
            dzielnik = 0;
            wynik = dzielna / dzielnik;
            System.out.println("Niemożliwe !!!");
        } catch (ArithmeticException e) // Okreslamy wyjatki, ktore chcemy wylapac
        {
            System.out.println("Dzielenie przez 0");
            // Okreslamy jak chcemy je obsluzyc
        }
        System.out.println("Po wyjatku");
        // Kod po obsludze wyjatku
    }
}
