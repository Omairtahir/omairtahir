/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omair;

/**
 *
 * @author omair tahir
 */
class Omair 
{ 
      
    // Decimal to binary conversion  
    // using recursion 
    static int find(int decimal_number) 
    { 
        if (decimal_number == 0)  
            return 0;  
              
        else
          
        return (decimal_number % 2 + 10 *  
                find(decimal_number / 2)); 
    } 
      
// Driver Code 
public static void main(String args[]) 
{ 
    int decimal_number = 10; 
    System.out.println(find(decimal_number)); 
} 
  
}
