/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbot_2101092021_modul8;

/**
 *
 * @author SONYA HASNA HAFIZAH
 */
public class Latihan2 {
    public static void main(String[] args){
       double a = Double.parseDouble(args[2]);
       double b = Double.parseDouble(args[3]);
       double sum,difference,product,quotient;
       
       sum = a+b;
       difference = a-b;
       product = a*b;
       quotient = a / b;
       System.out.println("Sum \t\t= "+sum);
       System.out.println("Difference \t= "+difference);
       System.out.println("Product \t= "+product);
       System.out.println("Qoutiant \t= "+quotient);
    }
}
