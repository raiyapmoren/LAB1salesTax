/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raisa
 */
import java.util.Scanner; //import the scanner class
public class main {
    public static void main( String [] args ){
        
        //Variables
        
        final double STATETAXPERCENT = 0.04;
        final double COUNTYTAXPERCENT = 0.02;
        double purchAmount;
        double countyTax;
        double stateTax;
        double totalTax;
        double totalSale;
        
        //Scanner
        Scanner scanner = new Scanner( System.in );
        
        System.out.println( "Enter the purchase amount: " );
        purchAmount = scanner.nextDouble();
        
        //Calcutale County Tax
        countyTax = COUNTYTAXPERCENT * purchAmount;
        
        //Calculate the state tax
        stateTax = STATETAXPERCENT * purchAmount;
        
        //Caculate the total tax
        totalTax = countyTax + stateTax;
        
        //Calulate the total sales 
        totalSale = totalTax + purchAmount;
        
        //Display
        
        System.out.println("Purchase amount: $" + purchAmount + "\n State sales tax: " + stateTax + "\n County sales tax: $" +
                countyTax + "\n Total sales tax : $" + totalTax + "\n Total Sale: $" + totalSale);
                
        
        
                
               
    }
}
