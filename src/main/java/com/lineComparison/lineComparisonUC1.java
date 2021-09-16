/*
 * model a line based on a point consisting of (x, y) co-ordinates using the Cartesian system and calculate its length.
 *  Assume the end points of line as (x1,y1) ,(x2,y2)
 *  
 */
package com.lineComparison;
import java.util.Scanner;
public class lineComparisonUC1 {
	public static void main(String arg[])
	
	{
           	 int x1,x2,y1,y2;
 
	         double length;
	         //taking end points of line from user (x1,y1) ,(x2,y2)
	         Scanner sc=new Scanner(System.in);
 
	         System.out.println("Enter the Value of x1 Co-ordinate: \n");
	   
                 x1=sc.nextInt();
	    
                 System.out.println("Enter the Value of y1 Co-ordinate: \n");
	   
                 y1=sc.nextInt();
 
	         System.out.println("Enter the Value of x2 Co-ordinate: \n");
	   
                 x2=sc.nextInt();
 
	         System.out.println("Enter the Value of y2 Co-ordinate: \n");
	   
                 y2=sc.nextInt();
	  	    
                 length=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
 	 	    	 	    
  	         System.out.println("Length of the line having co-ordinates \t"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+length);
 
	}
}
