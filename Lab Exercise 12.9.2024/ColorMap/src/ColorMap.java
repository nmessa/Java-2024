/**
 * @(#)ColorMap.java
 *
 * ColorMap application
 *
 * @Author: 
 * @version 1.00 2024/12/9
 */
import java.util.*;
import java.io.*;

public class ColorMap {
    
    public static void main(String[] args) throws IOException{
    	//Code to test MyColor class
    	/*MyColor one = new MyColor(100,100,100);
    	MyColor two = new MyColor(110,110,110);
    	double distance = one.distanceTo(two);
    	System.out.println(distance); //17.32050808
    	*/
    	//Create an array of 16 MyColor objects
    	//Add code here
    	
    	
    	//Declare variables
    	String line;
    	String cols[];
    	int r,g,b;
    	
    	//Open a file (colors.txt) for reading using a Scanner
    	//Add code here
    	
    	
    	//Read in 16 colors from file
    	for (int i = 0; i < 16; i++)
    	{
    		
    		//read in line of color values
    		//Add code here
    		
    		//break apart to color values
    		//Add code here
    		
    		//Convert r, g, b color values to int
    		//Add code here
    		
    		//System.out.println(r + " " + g + " " + b);  //for test purposes
    		
    		//construct MyColor object and put in array
    		//Add code here
    		
    	}
    	
    	
    	/*
    	Test the array of colors is working
 		in.close();
    	for (int i = 0; i < 16; i++)
    	{
    		System.out.println(colorMap[i]);
    	}*/
    	
    	//Read in the remaining colors to map
    	while(in.hasNext())
    	{
    		//Declare variables
    		double min = 500.0;
    		double distance;
    		int index = 0;
    		
    		//Read in a line
    		//Add code here
    		
    		//Break apart the line
    		//Add code here
    		
    		//Convert r, g, b values to int
    		r = Integer.parseInt(cols[0]);
    		g = Integer.parseInt(cols[1]);
    		b = Integer.parseInt(cols[2]);
    		
    		//construct MyColor object
    		MyColor temp = new MyColor(r,g,b);
    		
    		//check distance of color to color map values
    		for (int i = 0; i < 16; i++)
    		{
    			//find distance to color
    			//Add code here
    			
    			//find shortest distance
    			//Add code here
    		}
    		//print mapping results
    		System.out.println(temp + " maps to " + colorMap[index]);
    	}
    	in.close();
    }
}

/*
Output
(0, 0, 0) maps to (0, 0, 0)
(255, 255, 255) maps to (255, 255, 255)
(253, 254, 255) maps to (255, 255, 255)
(77, 79, 134) maps to (128, 128, 128)
(81, 218, 0) maps to (126, 168, 9)
*/