/**
 * @(#)ZipCode.java
 *
 * ZipCode application
 *
 * @author 
 * @version 1.00 2024/11/1
 */
import java.util.*;

public class ZipCode 
{

    public static String codes[] = {"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:",
     ":||::", "|:::|", "|::|:", "|:|::" };
    
    public static void main(String[] args) {
    	//Create variables
    	String zip;
    	
    	//Create a Scanner object
    	Scanner reader = new Scanner(System.in);
    	
    	//Get user input
    	System.out.println("Enter a zipcode: ");
    	zip = reader.next();
    	
    	//Print the barcode
    	//printBarCode(zip);	
    	
    }
    
    public static void printDigit(int d)
    {
    	//Add code here
    	
    }
    
    public static void printBarCode(String zipCode)
    {
    	//Add code here
    	
    }
}
