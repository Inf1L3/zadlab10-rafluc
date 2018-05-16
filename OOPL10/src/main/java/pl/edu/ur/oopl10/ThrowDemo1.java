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
public class ThrowDemo1 {

    static void metoda() throws IllegalAccessException {
        System.out.println("Wewnatrz metody");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[]) throws IllegalAccessException {
        metoda();
    }
}
