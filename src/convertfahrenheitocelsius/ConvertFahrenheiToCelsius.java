/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertfahrenheitocelsius;
import java.util.Scanner;
public class ConvertFahrenheiToCelsius {

       public static void main(String[] args) {
           Scanner input=new Scanner(System.in);
           System.out.println("Enter the Fahrenheit value");
           double fahrenheit=input.nextDouble();
           double celsius=(5.0/9)*(fahrenheit-32);
           System.out.println("Celsius value is"+celsius);
           }
    
}
