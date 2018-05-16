package pl.edu.ur.oopl10;

import java.util.Scanner;

/**
 *
 * @author mchla
 */
public class Main {

    public static void main(String[] args) {

        Scanner odczyt = new Scanner(System.in);

        System.out.println("Wpisz liczbę");
        WprowadzZKonsoli.wprowadzInt();

        double[] tab = new double[10];
        try {
            tab[10] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nieprawidłowy indeks tablicy," + " wyjątek: " + e);
        }

        try {
            zad3.test();
        } catch (ArithmeticException e) {
            System.out.println("Zlapany ponownie");
        }
    }

}
