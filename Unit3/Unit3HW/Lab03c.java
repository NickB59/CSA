//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
   	//add test cases
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter side A:: ");
		int a = keyboard.nextInt();
		System.out.print("Enter side B:: ");
		int b = keyboard.nextInt();
		System.out.print("Enter side C:: ");
		int c = keyboard.nextInt();
		
		Quadratic quad = new Quadratic(a, b, c);
		quad.setEquation(a, b, c);
		quad.calcRoots();
		quad.print();
		
		System.out.print("Enter side A:: ");
		int d = keyboard.nextInt();
		System.out.print("Enter side B:: ");
		int e = keyboard.nextInt();
		System.out.print("Enter side C:: ");
		int f = keyboard.nextInt();
		
		Quadratic stupid = new Quadratic(d, e, f);
		stupid.setEquation(d, e, f);
		stupid.calcRoots();
		stupid.print();
		
		System.out.print("Enter side A:: ");
		int g = keyboard.nextInt();
		System.out.print("Enter side B:: ");
		int h = keyboard.nextInt();
		System.out.print("Enter side C:: ");
		int i = keyboard.nextInt();
		
		Quadratic wolfgang = new Quadratic(g, h, i);
		wolfgang.setEquation(g, h, i);
		wolfgang.calcRoots();
		wolfgang.print();
   	
		
		
	}
}