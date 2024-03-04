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
public class ejercicio5 {

    public static void main(String[] args) {
        
        String input1 = JOptionPane.showInputDialog("Introduce el primer número:");
        String input2 = JOptionPane.showInputDialog("Introduce el segundo número:");
     


        double num1 = Integer.parseInt(input1);
        double num2 = Integer.parseInt(input2);


        double suma = (num1 + num2);
        double resta = (num1 - num2);
        double multi = (num1 * num2);
        double div = (num1 / num2);

        JOptionPane.showMessageDialog(null, "La suma de los dos números es: " + suma);
        JOptionPane.showMessageDialog(null, "La resta de los dos números es: " + resta);
        JOptionPane.showMessageDialog(null, "La multiplicación de los dos números es: " + multi);
        JOptionPane.showMessageDialog(null, "La división de los dos números es: " + div);
        
        /*System.out.println("la suma es: " + suma);
        System.out.println("la resta es: " + resta);
        System.out.println("la multiplicaciòn es: " + multi);
        System.out.println("la divisiòn es: " + div);*/
    }
}

