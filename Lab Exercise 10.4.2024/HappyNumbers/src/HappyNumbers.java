/**
 * @(#)HappyNumbers.java
 *
 * HappyNumbers application
 *
 * @author 
 * @version 1.00 2024/10/4
 */
import java.util.*;

public class HappyNumbers {
    
    public static void main(String[] args) {
    	for (int i = 1; i <= 1000; i++)
    	{
    		if(isHappy(i))
    		{
    			System.out.println(i);
    		}	
    	}
    }
    
    //This function returns true if number is happy
    public static boolean isHappy(int n)
    {
    	//Create an empty array list
    	ArrayList sad = new ArrayList();
    	
    	while (n != 1)
    	{
    		//if the arrayList contains the number not a happy number
    		if (sad.contains(n))
    		{
    			//Add code here
    			
    		}	
    		//Add number to sad list and get a new value
    		else
    		{
    			//Add code here
    		}			
    	}
    	//if n gets to 1
    	return true;
    }
    
    //This method calculates the value of a number by squaring each
    //digit and adding them together
    public static int calcValue(int number){
    	int temp, total = 0;
    	while (number > 0)
    	{
    		//Add code here
    		
    		
    	}
    	return total;
    }
}
