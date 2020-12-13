
/** This java file contains simple formulas to test out then
 * methods and parameters in java as opposed to python*/
 


package derivatives;

import java.lang.Math;

import java.util.Scanner;


public class main{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("radius for the area of a circle:");//for circle area calls the method below
		float areaCircle = areaCircle(myObj.nextInt());
		System.out.println("area of a circle is:" +areaCircle);
		
		System.out.println("height for the are of a cylinder:");
		System.out.println("radius for the are of a cylinder:");
		double areaCylinder = areaCylinder(myObj.nextInt(),myObj.nextInt());
		System.out.println("area of a cylinder is:" +areaCylinder);
		
		
		
		

 }
	//Area of a circle
	
		public static float areaCircle(int radius) {
			float pi = 3.14F;
			float areaCircle = (radius*radius)*pi;
			return areaCircle;
		}
		
		public static double areaCylinder(int height, int radius) {
			float pi = 3.14F;
			double areaCylinder = 2*pi*radius*height + 2*pi*(radius*radius);
			return areaCylinder;
		} 
		
		public static int Square(int number){
			  int result= number*number;
			  return result;
			  
			} 

		
	}


