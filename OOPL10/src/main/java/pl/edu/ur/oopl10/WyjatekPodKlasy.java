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
public class WyjatekPodKlasy {

    public static void main(String args[]) {
        try {
            int operacjaDzielenia = 224 / 0;
        } catch (Exception e) {
            System.out.println("Wyjatek generyczny");
        } //catch (ArithmeticException e) {
            //System.out.println("Nieosiagalny");
        //}
    }
}
