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
public class ThrowDemo {

    static void metoda() {
        try {
            //Tworzy nowy wyjątek a następnie wyrzuca go:
            throw new NullPointerException("demo");
            //Wyjątek zostaje natychmiast wyłapany:
        } catch (NullPointerException e) {
            System.out.println("Zlapany w metodzie");
            //Obsługa polega na przesłaniu wyjątku dalej:
            throw e;
        }
    }
}
