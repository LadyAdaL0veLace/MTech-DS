/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ds1;
import java.util.*;
/**
 *
 * @author Nidhi
 */
public class Ds1 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int gcd =1;
        
        for(int i=1;i<=number1&&i<=number2;i++)
        {
            if(number1%i==0 && number2%i==0)
                gcd =i;
        }
        System.out.println("the gcd is "+gcd);
    }
}
