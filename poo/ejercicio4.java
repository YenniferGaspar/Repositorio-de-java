/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;
import javax.swing.JOptionPane;
/**
 *
 * @author Lab8
 */
public class ejercicio4 {

    public static void main(String[] args) {
        
        String input1 = JOptionPane.showInputDialog("Introduce el primer número:");
        String input2 = JOptionPane.showInputDialog("Introduce el segundo número:");
     


        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);


        double promedio = (num1 + num2);


        /*JOptionPane.showMessageDialog(null, "La suma de los dos números es: " + promedio);*/
        
        System.out.println("la suma es: " + promedio);
    }
}

